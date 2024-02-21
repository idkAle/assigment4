import java.util.Scanner;

public class Main {

    public static void question1(int n) {
        if (n <= 0) { // Base Case
            return;
        } else { // Repeat n times
            System.out.println("Hello World!");
            question1(n - 1);
        }

    }

    public static int question2(int num1, int num2) {
        if (num1 > num2) { // a
            return 0;
        } else {
            int sum = 0;
            if (num1 % 7 == 0) {
                sum += num1;
            }
            return sum + question2(num1 + 1, num2);
        }
    }


    public static void question3(int lowVal, int highVal, Scanner scnr) {

        int userAnswer;
        int midVal = (highVal + lowVal) / 2;

        // Make first guess
        System.out.print("Is your number " + midVal + "? (0 = lower, 1 = higher, 2 = Correct): ");
        userAnswer = scnr.nextInt();

        if (userAnswer == 2) { // Base case
            System.out.println("Your number is " + midVal);
        }
        else { // Recursive case
            if (userAnswer == 0) {
                question3(lowVal, midVal, scnr); //Recursion and replace max value with the middle value to follow binary search algorithm rules
            }
            else if (userAnswer == 1) {
                question3(midVal + 1, highVal, scnr);//Recursion and replace middle value with min value
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Question 3");
        question3(0,100,scnr);

    }
}