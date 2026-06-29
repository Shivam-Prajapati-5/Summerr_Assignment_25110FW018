import java.util.*;

public class _102VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("______ VOTING SYATEM _____");
        System.out.print(" Enter a name : ");
        String name = sc.nextLine();
        System.out.print(" Enter a age :");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible for voting :");
            
        }
        else{
            System.out.println(" you are not eligible for voting :");
        }

        
        
    }
}
