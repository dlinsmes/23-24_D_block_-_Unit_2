import java.util.Scanner;

public class WhileLoops {
    public static void main(String [] args) {

        int a = 2;
        //a was declared in main() and can be used anywhere afterward in
        //main(), incl if-statements and loops
        if (a < 5) {
            a = 20;

            //variable scope - where a variable is visible and usable
            //-since b is declared in the if-statement, it only exists
            //within the if statement
            int b = 10;
            System.out.println("b is " + b);
        }
        System.out.println("a is " + a);


        //b is out of scope after the if-statement
        //System.out.println("b is " + b);

        //you can declare variables without setting an initial value
        int c;
        if (a < 30) {
            c = 11;
        }
        else {
            c = 20;
        }

        System.out.println();

        //loops let us repeat code
        //while loops are condition-based
        //-like repeating if-statements
        //-as long as the condition is true, the looped code continues to run

        int x = 0;

        //this condition is checked after each iteration (turn) of the loop to decide
        //whether to continue running
        while (x < 5) {
            System.out.println(x);

            x++; //adds 1 to x, same as x = x + 1 and x += 1
        }
        //the last value printed is 4, then x increments to 5, which makes the condition
        //no longer true
        System.out.println("the value of x AFTER the loop: " + x);

        System.out.println();

        x = 0;
        //x is NOT greater than 5, so the looped code never runs
        while (x > 5){
            System.out.println(x);
            x++;
        }
        System.out.println("second loop finished");

        System.out.println();

        x = 0;
        //(termination) condition needs to eventually beconme false for the loop
        //to finish running
//        while(x < 5) {
//            System.out.println(x);
//
//            //IMPORTANT - if the condition always stays true, the loop runs
//            //infinitely - BAD
//            //x++;
//        }
//        //with ingfinite loops, any code following the loop will never be reached
//        System.out.println("loop finished");


        //use while loops when you don't know how many times code needs to repeat
        System.out.println("type anything or enter quit to stop");

        //count how many times the prompt gets output
        int count = 1;

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        while (!input.equals("quit")) {
            //continue looping the prompt and getting input until the user types quit
            System.out.println("type anything or enter quit to stop");
            input = s.nextLine();

            count++; //increments every time the prompt is reprinted
        }
        //output ONLY the final count
        System.out.println("you were prompted " + count + " times");

        //validate input
        System.out.println("enter a number: 1, 2, or 3: ");
        int num = s.nextInt();
        //loop will run when the user types a number that's out of range
        // valid inputs:  num == 1 || num == 2 || num == 3

        //invalid input:!(num == 1 || num == 2 || num == 3)
        // num != 1 && num != 2 && num !-= 3
        //!(num <= && num >= 1 )
        while(num > 3 || num < 1){
            System.out.println("invalid - try again");
            System.out.println("enter a number: 1, 2, or 3: ");
            num = s.nextInt();
        }
        System.out.println("you entered " + num);

        x = 45;

        //BAD - you'll get deductions if you use while(true)/break
        //bc there's a way to simplify the logic
        while(true) { //this condition is always true, so the loop always runs
            if (x > 50) {
                break; //break will exit a loop
            }
            else {
                System.out.println(x);
                x++;
            }
        }

        System.out.println();

        //same logic
        x = 45;
        while (! (x > 50)) {
            System.out.println(x);
            x++;
        }

    }
}
