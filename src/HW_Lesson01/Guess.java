package HW_Lesson01;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(99) + 1;
        int maxAttempts = 10;
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                int n = scanner.nextInt();
                {
                    if (number == n) {
                        System.out.println("Ты угадал с " + (11 - maxAttempts) + " попытки");
                        break;
                    } else if (number < n) {
                        maxAttempts--;
                        System.out.println("Мое число меньше! У тебя осталось " + maxAttempts + " попыток");
                    } else {
                        maxAttempts--;
                        System.out.println("Мое число больше! У тебя осталось " + maxAttempts + " попыток");
                    }
                }
            }
        }
        if (maxAttempts == 0)
            System.out.println("Ты не угадал");

    }

}
