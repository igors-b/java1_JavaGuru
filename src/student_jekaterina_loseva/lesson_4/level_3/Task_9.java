package student_jekaterina_loseva.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first integer number:");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter second integer number:");
        int number2 = scanner.nextInt();
        System.out.println("Please, enter third integer number:");
        int number3 = scanner.nextInt();


        if ((number1 < number2) && (number2 < number3)) {
            System.out.println("increasing");
        } else if ((number1 > number2) && (number2 > number3)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }

}
