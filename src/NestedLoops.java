public class NestedLoops {
    public static void main(String [] args) {

        //nested loops - one loop can go in another

        int count = 0;
        for (int i = 0; i < 5; i++) {

            //IMPORTANT - inner loop needs a different variable than
            //the outer loop
            for (int j = 0 ; j < 10; j++) {
                count++;

                //potato will print 50 times bc the outer loop runs
                //5 times and the inner loop runs 10 times
                //-each time the outer loop runs, the inner loop will run
                //from start to finish
                System.out.println(count + " - potato - i is " + i + ", j is " + j);
            }

        }


        //nested loops can be used to print 2d grids
        //outer loop controls how many rows
        for (int i = 0; i < 4; i++) {
            //inner loop controls how many characters are in a row
            for (int j = 0; j < 8; j++) {
                //regular print() to keep one row on the same line
                System.out.print("x");
            }
            //println() to make a line break for the next row
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {


            //inner loop depends on the i value to determine
            //how many characters per row
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //same thing but outer loop counts backwards
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //generate the same pattern as above but with an incrementing outer loop
        //-use this pattern to generate spaces for pyramid problem
        for (int i = 0; i < 10; i++) {

            for (int j = 10; j > i ; j--) {
                System.out.print("x");
            }

            //second nested loop for Xs goes here

            System.out.println();

        }

    }
}


//      x
//     xxx
//    xxxxx
