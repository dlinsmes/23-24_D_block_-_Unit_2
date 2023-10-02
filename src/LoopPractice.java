import java.util.Scanner;
public class LoopPractice {
    public static void main(String [] args) {
        //wu
        //with a loop - ask the user to input 5 numbers
        //output the biggest number and the smallest number

        Scanner s = new Scanner(System.in);

        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = s.nextInt();
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("the biggest number was: " + biggest);
        System.out.println("the smallest number was: " + smallest);

        //biggest possible value an int can hold
        System.out.println(Integer.MAX_VALUE);

        //if you try to go beyond the max, unexpected things happen
        //to the value
        System.out.println(Integer.MAX_VALUE + 10);

        //smallest possible int value
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MIN_VALUE - 1);
    }
}
