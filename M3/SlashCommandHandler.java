package M3;

/*
Challenge 2: Simple Slash Command Handler
-----------------------------------------
- Accept user input as slash commands
  - "/greet <name>" → Prints "Hello, <name>!"
  - "/roll <num>d<sides>" → Roll <num> dice with <sides> and returns a single outcome as "Rolled <num>d<sides> and got <result>!"
  - "/echo <message>" → Prints the message back
  - "/quit" → Exits the program
- Commands are case-insensitive
- Print an error for unrecognized commands
- Print errors for invalid command formats (when applicable)
- Capture 3 variations of each command except "/quit"
*/
import java.util.random.*;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class SlashCommandHandler extends BaseClass {
    private static String ucid = "muk"; // <-- change to your UCID

    public static void main(String[] args) {
        printHeader(ucid, 2, "Objective: Implement a simple slash command parser.");

        Scanner scanner = new Scanner(System.in);

        // Can define any variables needed here
        int result = 0;
                                                        //Ucid = muk
        while (true) {                                  //Date 2/27/25
            System.out.print("Enter command: ");
            // get entered text
            
            String input = scanner.nextLine(); //Reading user input with scanner
            // check if greet
            //// process greet
            if (input.matches("/greet ")) {  //if input equals /greet
                System.out.println("Hello, " input + "!"); //print this message
            }
            // check if roll
            else if(input.matches("/roll ")){  //check if command starts with /roll
                int numDice = Integer.parseInt();  //number of dice
                int sides = Integer.parseInt(); //number of sides
             //// process roll
            
            Random rand = new Random();
    
            for (int i = 0; i < numDice; i++){
                result += rand.nextInt(sides); //roll the die
            }

            System.out.println("Rolled" + numDice + "d" + sides + "and got" + result + "!");
            }    
            //// handle invalid formats
            }
            // check if echo
            //// process echo
            else if(input.matches("/echo ")){
                
                System.out.println();
            }
            // check if quit
            else if (input.matches("/quit")){
                System.out.println("Program Ended");
            }
            //// process quit
            // handle invalid commnads
            else {
                System.out.println("Invalid command"); //invalid input
                break; 
           }
            // delete this condition/block, it's just here so the sample runs without edits
            
            }
        }
    
    
        printFooter(ucid, 2);
        scanner.close();
    }
}