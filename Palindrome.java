import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num, temp, rem, sum=0;
        System.out.println("Enter the number to check if it is a palindrome or not");
        num = myObj.nextInt();
        temp = num;
        while (num > 0) {
           rem = num % 10;
            sum = (sum *10) + rem;
            num = num /10;

            
        }
        if (temp == sum)
        {
            System.out.println("The number " + temp + " is a Palindrome");
        }
        else{
            System.out.println("The number "+ temp +" is not a Palindrome");
        }
    }
}
