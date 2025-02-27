package M3;

import java.text.DecimalFormat;

/*
Challenge 1: Command-Line Calculator
------------------------------------
- Accept two numbers and an operator as command-line arguments
- Supports addition (+) and subtraction (-)
- Allow integer and floating-point numbers
- Ensures correct decimal places in output based on input (e.g., 0.1 + 0.2 → 1 decimal place)
- Display an error for invalid inputs or unsupported operators
- Capture 5 variations of tests
*/

public class CommandLineCalculator extends BaseClass {
    private static String ucid = "muk"; // <-- change to your ucid

    public static void main(String[] args) {
        printHeader(ucid, 1, "Objective: Implement a calculator using command-line arguments.");

        if (args.length != 3) {
            System.out.println("Usage: java M3.CommandLineCalculator <num1> <operator> <num2>");
            printFooter(ucid, 1);
            return;
        }

        try {
            System.out.println("Calculating result...");
                                                

            
                                                 //UCID = muk
                                                 //2/24/25
            
           //extracting the equation 
           double num1 = Double.parseDouble(args[0]); // for num 1
           String operator = args[1];            // for using either + or -   (.parsDouble used to
           double num2 = Double.parseDouble(args[2]); // for num 2             turn nums are output right)

           
           double total = 0;   //initialize variable total
           if (operator.equals ("+")) {   //check if the operator is +
            total = num1 + num2; }                  //add num1 and num2
           else if (operator.equals("-")) { //check if nums are -
            total = num1 - num2; }                   //subtract num 1 and num 2
            else {
                System.out.println("Please enter the right format and numbers"); //if the right format
                                                                            //is not entered  
            }

            DecimalFormat df = new DecimalFormat("0.00"); //DecimalFormat is used to ensure decimal
            System.out.println(df.format(total));                 //display as the longest decimal passed
            
            //step 1 get the data.
            
            // extract the equation (format is <num1> <operator> <num2>)

            // check if operator is addition or subtraction

            // check the type of each number and choose appropriate parsing

            // generate the equation result (Important: ensure decimals display as the
            // longest decimal passed)
            // i.e., 0.1 + 0.2 would show as one decimal place (0.3), 0.11 + 0.2 would shows
            // as two (0.31), etc

            


        } catch (Exception e) {
            System.out.println("Invalid input. Please ensure correct format and valid numbers.");
        }

        printFooter(ucid, 1);
    }
}