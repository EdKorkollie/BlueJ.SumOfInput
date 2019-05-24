/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int number;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Any Number: ");
        number = input.nextInt();
        int Sum = 0;
        for (int i = 1; i <= number; i++)
        {
            
            //number = input.nextInt();
            Sum += i;
        }
        System.out.println("The Sum of the number you enter is: " + Sum);
        

    }
}
