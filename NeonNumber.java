import java.util.*;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a neon number or not");
        int num = myObj.nextInt();
        int sum=0;
        int square = num * num ;
        while(square!=0){
            int temp = square % 10;
            sum = sum + temp;
            square = square/10;
        }
       
        if(sum == num){
            System.out.println("It is a neon number");
        }
        else{
            System.out.println("It is not a neon number ");
        }
    }
}
