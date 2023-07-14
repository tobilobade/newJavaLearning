import java.util.Scanner;

public class TestArithmeticEngine {
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)){
                System.out.println("Enter first and second number: ");
                double firstNumber = input.nextDouble();
                double secondNumber = input.nextDouble();

                ArithmeticEngine engine = new ArithmeticEngine(firstNumber,secondNumber);
                System.out.printf("%s +%s = %s", firstNumber, secondNumber,engine.addTwoNumbers());
                System.out.println();
                System.out.printf("%s +%s = %s", firstNumber, secondNumber,engine.subTwoNumbers());
                System.out.println();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

