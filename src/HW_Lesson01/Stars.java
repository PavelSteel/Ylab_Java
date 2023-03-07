package HW_Lesson01;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();

            if (n > 0 && m > 0 && template != null) {
                String s = "";

                for (int i = 0; i < m; i++) {
                    s += template;
                }

                while (n > 0) {
                    System.out.println(s);
                    n--;
                }

            } else
                System.out.println("Вы ввели некорректные данные! Значения быть больше нуля.");
        }
    }
}
