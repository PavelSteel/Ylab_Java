package HW_Lesson02.Tests;

import HW_Lesson02.SnilsValidatorImpl;

public class SnilsValidatorTest {
    public static void main(String[] args) {
        System.out.println(new SnilsValidatorImpl().validate("01468870570"));

        System.out.println(new SnilsValidatorImpl().validate("90114404441"));
    }
}
