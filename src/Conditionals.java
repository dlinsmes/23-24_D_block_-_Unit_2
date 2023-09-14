import java.util.Scanner;
public class Conditionals {

    public static void main(String [] args) {

        //simulate flipping a coin and print out the
        //result of heads or tails

        //use a random number [1, 2]
        //1 is heads
        //2 is tails
        int flip = (int)(Math.random() * 2) + 1;

        //a boolean expression is treated as a condition
        //-if the condition is true, the code in the { } runs
        if(flip == 1) {
            System.out.println("heads");
        }
        // when the if-condition is false, the code in ELSE runs
        else {
            System.out.println("tails");
        }

        //else is optional - if there isn't an ELSE, no code runs
        //when the condition isn't true

        //get input for 3 different numbers
        //then output the biggest of the 3

        //s is just a variable name
        Scanner s = new Scanner(System.in);
        System.out.println("enter 3 different numbers");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = 0;

        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("max is " + max);



        if (a > b && a > c) {
            max = a;
        }

        //both of these if-statements will run
        // and check their conditions

        if (b > a && b > c) {
            max = b;
        }

        //max - 100; can't have other code between if/else

        //else is only attached to the IF that comes immediately
        //before it
        else
            max = c;
            //if the code inside an if/else is only one line, the { } not necessary
        System.out.println("max is " + max);


        if (a > b && a > c) {
            max = a;
        }
        //else if allows for additional branches of code to run based on conditions
        //only the first condition that's true will trigger code to run
        //any other conditions won't check/run, even if the condition is true
        //-when a is the biggest number, the else-if won't check and the else won't run
        else if (b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("max is " + max);

        //-can have multiple else-ifs
        //else is always optional

        s.nextLine();

        //have the user enter a password, and give ONE piece of feedback for
        //-correct
        //has 0 length (entered nothing)
        //has the correct length (but incorrect)
        //otherwise incorrect

        String realPW = "123456!";
        System.out.println("enter your password");
        String userPW = s.nextLine();

        if(realPW.equals(userPW)) {
            System.out.println("wow good job A+ v proud of you");
        }
        //a string's length is its number of characters
        else if (userPW.length() == 0) {
            System.out.println("you didn't type anything dumdum");
        }
        //if the real pw is entered, this won't check bc ELSE IF is used
        else if (userPW.length() == realPW.length()) {
            System.out.println("nice try but FAIL");
        }
        else {
            System.out.println("WRONG");
        }

        //get input for a number between 10 and 20. give feedback for if it's
        //in range, too low, too high

        System.out.println("enter a number between 10 and 20");
        int num = s.nextInt();

        if (num > 10) {
            //if-statements can be placed in other if-statements
            //when the other condition is false, none of the inner conditions/code
            //get run
            if (num > 20) {
                System.out.println("too high");
            }
            else {
                System.out.println("in range");
            }
        }
        //look at indentation and { } to make sure you're writing code where you intend
        else {
            System.out.println("too low");
        }
    }
}
