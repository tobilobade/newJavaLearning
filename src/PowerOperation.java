import java.util.Scanner;

public class PowerOperation implements NewTest{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the base: ");
//        double base = scanner.nextDouble();
//
//        System.out.print("Enter the exponent: ");
//        int exponent = scanner.nextInt();
//
//        double result = Math.pow(base, exponent);
//        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        Scanner scanner = new Scanner(System.in);
        PowerOperation op = new PowerOperation();

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = op.power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    @Override
    public double power(double base, int exponent) {
        double result = 1.0;

        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i > exponent; i--) {
                result /= base;
            }
        }

        return result;
    }

    }

