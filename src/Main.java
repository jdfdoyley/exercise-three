import java.util.Scanner;

/*
* Program: Write Java program to divide two numbers and print the screen.
* Date: December 12, 2022
* */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number one: ");
        int num1 = input.nextInt();
        System.out.print("Input number two: ");
        int num2 = input.nextInt();

        System.out.println("\nQuotient: " + (num1/num2));
    }
}
