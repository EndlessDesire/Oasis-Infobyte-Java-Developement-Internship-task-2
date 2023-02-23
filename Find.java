import java.util.*;
import javax.swing.*;
public class Find{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100 + 1); //  random number is generated through Math.random function 
        int input = 0;
        int right=0;
        // this input will store user's response 
        int count = 0;
        try {
            while (input != randomNum) {
                String responsed = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                input = Integer.parseInt(responsed);
                JOptionPane.showMessageDialog(null, " " + determineGuess(input, randomNum, count,right));
                count++;
                if(count>=5){
                    JOptionPane.showMessageDialog(null, "No of Correct Guess=" +right);
                    JOptionPane.showInputDialog(null, "Press 1 to continue and Any key to exit ");
                    int r=sc.nextInt();
                    if(r==1){
                        continue;
                    }
                    else{
                        break;
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        sc.close();
    }

    public static String determineGuess(int input , int randomNum , int count,int right)
    {
        if (input <= 0 || input > 100) {
            // if the number is not in range it will give invalid number 
            return "Your guess is invalid";
        } else if (input == randomNum) {
            right++;
            return "Correct! \n Total Guesses : " + count;
        } else if (input > randomNum) {
            return "Your guess is too high, try again, \n Try Number : " + count;
        } else if (input < randomNum) {
            return "Your guess is too low, try again, \n Try Number :  " + count;
        } else {
            return "Your guess is incorrect \n Try Number : " + count;
        }

    }
}