package HW_Lesson02;

public class ComplexNumbersImpl implements ComplexNumbers {
    private double valid;
    private double imaginary;

    public ComplexNumbersImpl(double valid) {
        this.valid = valid;
    }

    public ComplexNumbersImpl(double valid, double imaginary) {
        this.valid = valid;
        this.imaginary = imaginary;
    }

    @Override
    public ComplexNumbers sum(double valid1, double imaginary1) {
        return new ComplexNumbersImpl(valid + valid1, imaginary + imaginary1);
    }

    @Override
    public ComplexNumbers sub(double valid1, double imaginary1) {
        return new ComplexNumbersImpl(valid - valid1, imaginary - imaginary1);
    }

    @Override
    public ComplexNumbers mult(double valid1, double imaginary1) {
        return new ComplexNumbersImpl(valid * valid1, imaginary * imaginary1);
    }

    @Override
    public double abs() {
        double res = Math.abs(valid + imaginary);
        return 0;
    }

    @Override
    public String toString() {
        return "ComplexNumbersImpl{" +
                "valid=" + valid +
                ", imaginary=" + imaginary +
                '}';
    }
}
