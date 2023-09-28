import java.util.Scanner;
public class ForLoops {
    public static void main(String [] args) {
        //wu
        //keep asking the user to enter a number until they
        //enter a multiple of 7

        Scanner s = new Scanner(System.in);

//        System.out.println("enter a number");
//        int x = s.nextInt();
//
//        //continue until x is divisible by 7 - no remainder after dividing by 7
//        while (x % 7 != 0) {
//            System.out.println("enter a number");
//            x = s.nextInt();
//        }
//        System.out.println(x + " is divisible by 7");

//        boolean isMult = false;
//        // same as while(isMult == false)
//        while (!isMult) {
//            System.out.println("enter a number");
//            int x = s.nextInt();
//            if (x % 7 == 0) {
//                isMult = true;
//                System.out.println(x + " is a multiple of 7");
//            }
//        }

        //while loops are condition-based - run until the condition becomes false
        //for loops - iteration based - use when you know how many times the
        //loop needs to run

        //initialization - int i = 0 - give an initial value to a variable
        //condition - i < 10 - loop runs when true, stops when false
        //advancement - i++ - update value of variable
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //before an iteration (turn) of the loop - check if the condition is true
        //-if so, run loop code; if not, stop
        //at the end of each iteration, apply the advancement step to the variable

        //9 is the last value output bc when i is advanced to 10, the condition
        //becomes false

        //System.out.println(i);
        //the scope of the var i is only within the loop
        //-this means you can have consecutive for loops that all use var i

        System.out.println();

        //advancement step changes
        //-changes the number of iterations
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //for loops can decrement (count backwards)
        for (int i = 20; i >= 15; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //for loops can be written as while loops
        int a = 20;
        while (a >= 15) {

            System.out.print(a + " ");

            //in while-loop form, the advancement step
            // should be at the end of the loop
            a--;
        }

        System.out.println();

        //while loops can't always be written as for loops bc you may not
        //know how many iterations are needed
        //ex - ask the user for numbers until they enter a mult of 7

        //ask the user for 3 numbers then print the sum of their numbers
        //(don't need to re-output their input numbers)
        int sum = 0;
        for(int i = 3; i > 0; i--) {
            System.out.println("enter a mumber");
            int num = s.nextInt();
            //needs to be declared before the loop so that the value doesn't reset
            //every iteration
           // int sum = 0;
            sum += num;
        }
        System.out.println("the sum of numbers is " + sum);

        //ask the user what num they want multiples
        //and how many multiples to print
        //ex: 3 then 5
        //out: 3, 6, 9, 12, 15
        System.out.println("what number do you want multiples of?");
        int mult = s.nextInt();
        System.out.println("how many multiples do you want?");
        int quantity = s.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.print( (mult*i) + " " );
        }

        System.out.println();

        for (int i = 0; i < quantity; i++) {
            System.out.print((i+1) * mult + " ");
        }

        System.out.println();

        for (int i = mult; i <= (mult*quantity); i+=mult) {
            System.out.print(i + " ");
        }

        //ask the user for a prime number, then verify whether it's really prime
        //or not

        //-a number is prime if it's divisible only by itself and 1

        System.out.println("enter a prime number");
        int userNum = s.nextInt();

        boolean isPrime = true;

        //check for divisibility by numbers [2, userNum)
        for (int i = 2 ; i < userNum; i++) {

            //if this is true, userNum was divisible by some number --> not prime
            if (userNum % i == 0) {
                isPrime = false;
            }

        }

        //same as if (isPrime == true)
        if (isPrime) {
            System.out.println("prime number");
        }
        else
            System.out.println("not prime");

    }
}
