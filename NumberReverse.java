import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.err.println("Enter the number to be reversed");
        int num = myObj.nextInt();

        int temp, fact=0;
        temp = num;
        while(num > 0){
            temp = num %10;
            fact = (fact*10 )+ temp;
            num = num/10;
        
    }
    System.out.println(" The reversed number is "+ fact);
}}



