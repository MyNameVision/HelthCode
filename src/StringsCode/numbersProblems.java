package StringsCode;

import java.util.Scanner;

public class numbersProblems {

    // 1. Swap Two Numbers
    static void swapNumbers(int a, int b) {

        System.out.println("Before Swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    // 2. Factorial of a Number
    // Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
    static void factorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }

    // 3. Fibonacci Series
    // Each number is the sum of the previous two numbers
    static void fibonacci(int number) {

        int first = 0;
        int second = 1;
        String result = "";

        for (int i = 0; i < number; i++) {

            result = result + first + " ";

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("Fibonacci Series: " + result);
    }

    // 4. Armstrong Number
    // For a 3-digit number: sum of cubes of digits = original number
    static void armstrong(int number) {

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;

            sum = sum + (digit * digit * digit);

            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

    // 5. Perfect Number
    // Example: 6 -> 1 + 2 + 3 = 6
    static void perfectNumber(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    // 6. Sum of Digits
    static void sumOfDigits(int number) {

        int sum = 0;

        while (number != 0) {

            int digit = number % 10;

            sum = sum + digit;

            number = number / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }

    // 7. Reverse a Number
    static void reverseNumber(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {

            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;
        }

        System.out.println(
                "Reverse of " + originalNumber + " = " + reversedNumber
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = sc.nextInt();


        swapNumbers(5, 10);
        factorial(number);
        fibonacci(number);
        armstrong(number);
        perfectNumber(number);
        sumOfDigits(number);
        reverseNumber(number);

        sc.close();

    }
}
