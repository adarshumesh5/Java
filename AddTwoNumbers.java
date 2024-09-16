import java.util.*;

public class AddTwoNumbers {

    
    public static void main(String[] args) {
        double num1,num2, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the two numbers2");
        num1 = myObj.nextDouble();
        num2 = myObj.nextDouble();

        sum = num1 + num2;
        System.out.println(sum);
    }
}
