package HW_Lesson01;

public class MultTable {
    public static void main(String[] args) throws Exception {
        //to do: необходимо распечатать таблицу умножения чисел от 1 до 9 (включая)

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}
