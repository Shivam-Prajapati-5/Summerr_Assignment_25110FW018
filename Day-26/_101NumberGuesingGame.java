import java.util.*;

public class _101NumberGuesingGame{
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1 , 100);
       // System.out.println(randomNumber);

        System.out.println("Number guessing game :");
        System.out.println("Guess a number between 1-100 :" );


        do { 
            System.out.print("Enter a guess number : ");
            guess = sc.nextInt();
            attempts++;
            if(guess<randomNumber){
                System.out.println("Too low ! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("Too High ! try again");
            }
            else{
                System.out.println("CORRECT ! ");
                System.out.println("Total attempts = " + attempts);
            }
            
        } while (guess != randomNumber);
        System.out.println(" You have won ");
        
    }
}