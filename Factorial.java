import java.util.*;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Enter the number to find the factorial of");
        int number = myObj.nextInt();
        int fact =1;

        for(int i=number; i>0 ;i--){
            fact = fact*i;

        }
        System.out.println("The factorial of the number " + number +" is "+ fact);

    }
}
