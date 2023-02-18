import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /*
     * A simple calculator program because i got bored.
     */

    public static int x = 0;
    public static double num1, num2, num3;
    public static String[] opt = {"1. add", "2. subtract", "3. multiply", "4. divide", "5. square", "6. root"};
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            calculate();
        } catch (InputMismatchException exception) {
            System.out.println("Your must input an integer, not a string, program ending.");
        }
    }

    public static void calculate() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(opt[i]);
        }
        x = scanner.nextInt();
        switch (x) {
            default -> {
                System.out.println("Please enter a number that is in the list.");
                calculate();
            }
            case 1 -> {
                input();
                num3 = num1 + num2;
                System.out.println("your number is: " + num3);
            }
            case 2 -> {
                input();
                num3 = num1 - num2;
                System.out.println("your number is: " + num3);
            }
            case 3 -> {
                input();
                num3 = num1 * num2;
                System.out.println("your number is: " + num3);
            }
            case 4 -> {
                input();
                num3 = num1 / num2;
                System.out.println("your number is: " + num3);
            }
            case 5 -> {
                System.out.println("please enter the number that you want to square.");
                num1 = scanner.nextInt();
                num3 = num1 * num1;
                System.out.println("your number is: " + num3);
            }
            case 6 -> {
                System.out.println("please enter the number that you want to find the root of.");
                num1 = scanner.nextInt();
                num3 = Math.sqrt(num1);
                System.out.println("your number is: " + num3);
            }
        }
    }

    public static void input() {
        System.out.println("enter a number");
        num1 = scanner.nextInt();
        System.out.println("enter another number");
        num2 = scanner.nextInt();
    }
}