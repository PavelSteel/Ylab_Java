package HW_Lesson02;

public interface ComplexNumbers {
    ComplexNumbers sum(double valid, double imaginary);
    ComplexNumbers sub(double valid, double imaginary);
    ComplexNumbers mult(double valid, double imaginary);
    double abs();
}
