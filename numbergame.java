import java.util.*;
import javax.swing.*;
 
public class numbergame {
    public static void main(String[] args) {

        int generatednumber = (int) (Math.random()*100 + 1);
    
        int input = 0;

        int count = 1;

        determineGuess(input, generatednumber, count);
 
        while (input != generatednumber){
            String response = JOptionPane.showInputDialog(null,"Guess between 1 and 100", "Let's Guess", 3);
            input = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(input, generatednumber, count));
            count++;
        }  
        
    }

    public static String determineGuess(int input, int generatednumber, int count){
       
            if (input <=0 || input >100) {
                return "Invalid Guess ";
            }
            else if (input == generatednumber ){
                return "Congratulations!\nTotal Guesses: " + count;
            }
            else if (input > generatednumber) {
                return "Your guess is too high, Please try again.\nTry Number: " + count;
            }
            else if (input < generatednumber) {
                return "Your guess is too low, Please try again.\nTry Number: " + count;
            }
            else {
                return "Your guess is incorrect\nTry Number: " + count;
            }

        
        
    }
}
