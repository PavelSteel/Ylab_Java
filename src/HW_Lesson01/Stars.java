package HW_Lesson01;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();
            StringBuilder s = new StringBuilder();

            if (n > 0 && m > 0 && template != null) {
                s.append(template.repeat(m));
            } else {
                throw new NullPointerException("Вы ввели некорректные данные! Значения должны быть больше нуля.");
            }
            while (n > 0) {
                System.out.println(s);
                n--;
            }
        }
    }
}
