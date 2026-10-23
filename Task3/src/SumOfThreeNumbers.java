import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));

        System.out.println("The product of the numbers is " + (first * second * third));

        // we need to create a new variable for storing number with decimals.
        // it won't work if the divider is 3 instead of 3.0.
        // if it is 3, only the integer answer will be returned although "double" variable is used.

        double value = (first + second + third) / 3.0;

        System.out.printf("The average of the numbers is %.8f" , value);
    }
}