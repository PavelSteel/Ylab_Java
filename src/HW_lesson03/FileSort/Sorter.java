package HW_lesson03.FileSort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorter {
    public File sortFile(File dataFile) throws IOException {
        File dataFile2 = new File("dataFile2.txt");
        File dataFile3 = new File("dataFile3");
        File dataFile4 = new File("dataFile4");
        File pusto = new File("Pustishka.txt");

        long count = 0;
        long numSplits;
        long countSplit;
        List<File> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream(dataFile))) {
            while (scanner.hasNextLong()) {
                long current = scanner.nextLong();
                count++;
            }
        }
        numSplits = count / 10;
        countSplit = count / numSplits;
        sorting(dataFile, countSplit, numSplits, dataFile2, list, pusto);


        countSplit /= 2;
        numSplits *= 2;
        sorting(dataFile2, countSplit, numSplits, dataFile3, list, pusto);


        numSplits = count / 2;
        countSplit /= 2;
        sorting(dataFile3, countSplit, numSplits, dataFile4, list, pusto);

        dataFile2.delete();
        dataFile3.delete();
        dataFile.delete();
        deleteSpliteFiles(list);


        return dataFile4;
    }

    private void sorting(File dataFileStart, long countSplit, long numSplits, File dataFileFinis, List<File> list, File pusto) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dataFileStart));
        deleteSpliteFiles(list);
        list.clear();
        for (int destIx = 1; destIx <= countSplit; destIx++) {
            File fileN = createdFilesAndWrite(destIx, reader, numSplits);
            list.add(fileN);
        }
        if (countSplit % 2 != 0) {
            list.add(pusto);
        }
        reader.close();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dataFileFinis))) {
            for (int j = 0; j < list.size() - 1; ) {

                sortAndWrite(list.get(j), list.get(j + 1), bw, numSplits);
                j += 2;
            }
        }
    }

    private void deleteSpliteFiles(List<File> list) {
        for (File f : list) {
            f.delete();
        }
    }

    private void sortAndWrite(File file, File file1, BufferedWriter bw, long numLine) throws IOException {
        Long[] l1 = arrLongFileReader(file, numLine);
        Long[] l2 = arrLongFileReader(file1, numLine);
        if (l2 == null) {
            Arrays.sort(l1);
            arrWriteFile(l1, bw);
        } else {
            Long[] res = join(l1, l2);
            arrWriteFile(res, bw);
        }
    }

    private void arrWriteFile(Long[] res, BufferedWriter bw) throws IOException {
        if (res.length > 0) {
            for (int i = 0; i < res.length; i++) {
                String s = res[i].toString() + '\n';
                bw.write(s);
            }
        }
    }

    static void readWrite(BufferedReader inputStream, BufferedWriter bw, long numLine) throws IOException {

        Long[] buf = new Long[(int) numLine];
        for (int i = 0; i < buf.length; i++) {
            String s = inputStream.readLine();
            buf[i] = Long.valueOf(s);
        }
        Arrays.sort(buf);
        if (buf.length > 0) {
            for (int i = 0; i < buf.length; i++) {
                String s = buf[i].toString() + '\n';
                bw.write(s);
            }
        }
    }

    private Long[] arrLongFileReader(File file, long numLine) throws IOException {
        Long[] l = new Long[(int) numLine];
        if (!file.exists()) {
            return null;
        } else {
            try (BufferedReader r = new BufferedReader(new FileReader(file))) {
                for (int i = 0; i < l.length; i++) {
                    String s = r.readLine();
                    l[i] = Long.valueOf(s);
                }
                Arrays.sort(l);
            }
        }
        return l;
    }

    public static Long[] join(Long[] a, Long[] b) {
        Long[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        Arrays.sort(result);
        return result;
    }

    private File createdFilesAndWrite(int numbName, BufferedReader reader, long numSplits) throws IOException {
        File fileN = new File("split." + numbName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileN));
        readWrite(reader, bw, numSplits);
        bw.close();
        return fileN;
    }
}
