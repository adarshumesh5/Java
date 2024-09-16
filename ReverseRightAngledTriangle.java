import java.util.*;

public class ReverseRightAngledTriangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the character for Reverse Right angled Triangle");
        String a = myObj.nextLine();
        System.out.println("Enter the length of the triangle");
        int length = myObj.nextInt();
        for (int i= 0; i<= length; i++){  
 
            for (int j=1; j<=length-i; j++){  
                System.out.print(" ");  
            }  
            for (int k=0;k<=i;k++){  
                System.out.print(a);  
            }   
            System.out.println("");  
        }  
    }
}

