import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if (number2 != 0 && number1 % number2 == 0) {
            System.out.println(number1 + " is divisible by " + number2);
        } else {
            System.out.println(number1 + " is not divisible by " + number2);
        }

        input.close();
    }
}
