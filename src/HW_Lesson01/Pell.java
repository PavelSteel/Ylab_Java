package HW_Lesson01;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {

        //а (n) = 2 * а (n-1) + а (n-2)
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if(n>=0 && n<=30) {
                long a0 = 0;
                long a1 = 1;
                long res = 0;
                for (int i = 3; i <= n; i++) {
                    res = 2 * a1 + a0;
                    a0 = a1;
                    a1 = res;
                }
                System.out.println(res);
            } else {
                throw new RuntimeException("Введены некорректные данные");
            }
        }
    }
}
