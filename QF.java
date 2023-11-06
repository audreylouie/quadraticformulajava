import java.util.Scanner;
import java.util.Random;
public class QF{
    public static void main(String[] args) {
        // Declaring variables a , b, and, c
        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in); // Creating a new scanner to get users' input

        // Asking for user's input
        System.out.print("Enter a value for a: ");
        a = input.nextInt();
        System.out.print("Enter a value for b: ");
        b = input.nextInt();
        System.out.print("Enter a value for c: ");
        c = input.nextInt();

        double is_imaginary = Math.pow(b, 2) - 4 * a * c; // Determining whether roots are real or imaginary

        if (is_imaginary > 0) { // If is_imaginary is greater than 0, that means that the roots are real
            // Calculating roots
            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            // Displaying calculations
            System.out.println("The real roots for the equation ax^2 + bx + c = 0 when a = " + a + ", b = " + b + ", and c = " + c + " is:");
            System.out.println("x = " + x1);
            System.out.println("x = " + x2);
        } else { // If is_imaginary is < 0, then the roots are imaginary

            // Calculating imaginary roots
            double real_num = -b / (2 * a);
            double imaginary = Math.sqrt(-is_imaginary) / (2 * a);

            // Displaying calculations
            System.out.println("The imaginary roots for the equation ax^2 + bx + c = 0 when a = " + a + ", b = " + b + ", and c = " + c + " is:");
            System.out.println("x = " + real_num + " + " + imaginary + "i");
            System.out.println("x = " + real_num + " - " + imaginary + "i");
        }
        Scanner Practice = new Scanner(System.in); // Creating a new scanner

        // Asking the user if they'd like more practice
        System.out.print("Would you want more practice? (enter y or n): ");
        char Response = Practice.next().charAt(0); // getting user's input

        if (Response == 'y') { // If statement for if they enter "y"
            Random num = new Random();

            // Generating random numbers for values a, b and c (1-10)
            double a_num = num.nextInt(10)+1;
            double b_num = num.nextInt(10)+1;
            double c_num = num.nextInt(10)+1;

            double is_Imaginary = Math.pow(b_num, 2) - 4 * a_num * c_num; // Checking if the roots will be imaginary or real

            if (is_Imaginary > 0) { // If statement for if roots are real
                System.out.println(+a_num + "x^2 +" + b_num + "x +" + c_num + " = 0"); // Displaying practice problems

                Scanner answer = new Scanner(System.in); // Creating new scanner

                // Calculating roots
                double rand_x1 = (-b_num + Math.sqrt(Math.pow(b_num, 2) - 4 * a_num * c_num)) / (2 * a_num);
                double rand_x2 = (-b_num - Math.sqrt(Math.pow(b_num, 2) - 4 * a_num * c_num)) / (2 * a_num);

                // Rounding answers to the nearest tenth place
                rand_x1 = Math.round(rand_x1*10);
                rand_x1 = rand_x1/10;
                rand_x2 = Math.round(rand_x2*10);
                rand_x2 = rand_x2/10;

                // Asking user to enter their answer
                System.out.print("Enter real root when you add at ± (round to the nearest tenth place if necessary *if 100th place is 5, don't round up*): ");
                double user_ans_1 = answer.nextDouble();
                System.out.print("Enter real root when you subtract at ±(round to the nearest tenth place if necessary *if 100th place is 5, don't round up*): ");
                double user_ans_2 = answer.nextDouble();

                // if statements to check if the user got the answer correct
                if (rand_x1 == user_ans_1 && rand_x2 == user_ans_2) {
                    System.out.println("You got the answer correct!");
                } else {
                    System.out.println("You got the answer incorrect!");
                    System.out.println("The answer is:");
                    System.out.println("x = " + rand_x1);
                    System.out.println("x = " + rand_x2);
                }
            }

            else{ // If the roots are imaginary

                // Displaying equation
                System.out.println(+ a_num + "x^2 + " + b_num + "x + " + c_num + " = 0");
                Scanner imaginary_answer = new Scanner(System.in); // Creating new scanner

                // Calculating roots
                double rand_real_num = -b_num / (2 * a_num);
                double rand_imaginary = Math.sqrt(-is_Imaginary) / (2 * a_num);

                // Rounding answers to the nearest tenth place
                rand_real_num = Math.round(rand_real_num * 10);
                rand_real_num = rand_real_num/10;
                rand_imaginary = Math.round(rand_imaginary*10);
                rand_imaginary = rand_imaginary/10;

                // Asks user to enter their answer
                System.out.print("Enter the real part of the root (round to the nearest tenth place if necessary *if 100th place is 5, don't round up*): ");
                double imaginary_ans_1 = imaginary_answer.nextDouble();
                System.out.print("Enter the imaginary part of real root || *omit the i and operation* (round to the nearest tenth place if necessary *if 100th place is 5, don't round up*): ");
                double imaginary_ans_2 = imaginary_answer.nextDouble();

                // If statement to check if their answer is correct
                if (imaginary_ans_1 == rand_real_num && imaginary_ans_2 == rand_imaginary) {
                    System.out.println("You got the answer correct!");
                    System.out.println("x = " + rand_real_num + " + " + rand_imaginary + "i");
                    System.out.println("x = " + rand_real_num + " - " + rand_imaginary + "i");
                } else {
                    System.out.println("You got the answer incorrect!");
                    System.out.println("The answer is:");
                    System.out.println("x = " + rand_real_num + " + " + rand_imaginary + "i");
                    System.out.println("x = " + rand_real_num + " - " + rand_imaginary + "i");
                }

            }
            System.out.println("Thanks for using our calculator!"); // Displays this message
            }

            if (Response == 'n') { // If user enters "n"
                System.out.println("Ok, thanks for using our calculator!"); // Displays this message
            }
    }
}