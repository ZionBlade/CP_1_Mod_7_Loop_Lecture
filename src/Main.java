import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";
        boolean done = false;
        int favNum = 0;


        double itemPrice = 0;
        double totalPrices = 0;
        double avePrice = 0;
        int numItems = 0;
        String respYN = "";

        double grade = 0; // valid grades are 0-100
        double aveGrade = 0;
        double totalGrades = 0;
        int numGrades = 0;
        final double SENTINEL = -1;

        //do while loop use every time for input
        //try to get the input
        //repeat until we get it

        /*
        do
        {

        }while(condition);

        boolean done = false;
        do
        {

        }while(!done);


         */
        done = false;
        do {
            //existing age code from last lecture
            System.out.print("\nEnter your age: ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                in.nextLine(); // have to clear the buffer after reading a number
                System.out.println("You said your age is: " + age);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while(!done);

        done = false;
        do {
            System.out.print("Enter Your fav num [1-10]: ");
            if(in.hasNextInt())
            {
                favNum = in.nextInt();
                in.nextLine();
                if (favNum >= 1 && favNum <= 10) {
                    System.out.println("\nYou said your fav num is: " + favNum);
                    done = true;
                } else {
                    System.out.println("You said your fav num is " + favNum + " but that is out of range");
                }
            } else  //did not have an int
            {
                trash = in.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid price!");
            }
        }while(!done);


        //get the data
        done = false;

        do{
            //get an item price
            System.out.print("\nPlease enter the item price: ");
            if(in.hasNextDouble()) {
                itemPrice = in.nextDouble();
                in.nextLine(); //clear the newline from the buffer

                //add the price to the total
                totalPrices += itemPrice; // totalPrices = totalPrices + itemPrice
                //this is the aggregator or accumulator

                numItems++; //++ means whatever is already there, add one to it, -- means subtract one from it.
                // incrementor numItems = numItems + 1
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }

            System.out.print("Do you have another item [Y/N]: ");
            respYN = in.nextLine();
            if(respYN.equalsIgnoreCase("N"))
            {
                done = true;
            }
        }while(!done);

            avePrice = totalPrices / numItems;

            System.out.println("Number of items is: " + numItems);
            System.out.println("The total of the items is: " + totalPrices);
            System.out.println("the average is: " + avePrice);

            // gradebook example of sentinel input

        done = false;
        do {
            System.out.print("\nPlease enter the grade [0-100] or -1 to quit: ");

            if(in.hasNextDouble()) {
                grade = in.nextDouble();
                in.nextLine(); //clear the newline from the buffer

                if(grade != SENTINEL){

                    if(grade >= 0 && grade <= 100) {
                        totalGrades += grade;

                        numGrades++;
                    } else {
                        System.out.println("Grade must be in range [0-100]: You entered " + grade); // true bullet proofing
                        //agile programming, minimum up and running as quickly as you can, then add more as you go
                    }
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + " must be a valid grade!");
            }

        }while(!done);

        aveGrade = totalGrades / numGrades;
        System.out.println("Number of grades is: " + numGrades);
        System.out.println("The total of the grades is: " + totalGrades);
        System.out.println("the average is: " + aveGrade);

    }
}