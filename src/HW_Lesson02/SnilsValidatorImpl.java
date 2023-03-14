package HW_Lesson02;

public class SnilsValidatorImpl implements SnilsValidator {
    boolean result = false;

    @Override
    public boolean validate(String snils) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(String.valueOf(snils.charAt(i))) * (9 - i);
        }
        int digitControl;
        if (100 > sum) {
            digitControl = sum;
        } else if (100 == sum) {
            digitControl = 0;
        } else {
            int modulo = sum % 101;
            if (modulo == 100) {
                digitControl = 0;
            } else
                digitControl = modulo;
        }
        String sub = snils.substring(9, 11);

        result = Integer.toString(digitControl).equals(sub);
        return result;
    }
}
