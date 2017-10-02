/*
 * Eli James
 * October 2 2017
 * Asks the user for character and an integer and will print a square of the inputted length with the inputted character to the console
 */

package displayingasquareofanycharacter;
import java.util.Scanner;
/**
 * executes the main method, collecting the user's desired length and character to fill the square with
 * 
 */
public class DisplayingASquareofAnyCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates scanner object to collect informaton from user
        Scanner input = new Scanner(System.in);
        
        //asks user for desired length
        System.out.println("Please input your desired side length: ");
        int length = input.nextInt();
        
        //asks user for desired character
        System.out.print("Please input your desire character to form the square: ");
        char symbol = input.next().charAt(0);
        
        //calls a method and passes an argument (the inputted number)
        squareMaker(length, symbol);
       
        //closes input stream
        input.close();
        
    }
    /**
     * Prints a square of side length passed as the 1st parameter with each character being that of the 2nd parameter
     * pre: an integer argument is passed and a character argument is passed
     * post: prints out the square of desired length made of desired characters
     */
    public static void squareMaker(int len, char sym){
        //1. loop that calls the loop below the parameter number of times
        for ( int i = 0; i<len;i++){
            //2. loop that prints that character horizontally the paramater number of times
            for (int o = 0;o<len;o++){
                System.out.print(sym);
            }System.out.println("");
        }
        
    }
    
}
