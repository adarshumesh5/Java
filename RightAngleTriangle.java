import java.util.*;

public class RightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the Character to print the right angle triangle");
        Scanner myObj = new Scanner(System.in);
        String a = myObj.nextLine();
        System.out.println("Enter the length of the right angle triange");
        int length = myObj.nextInt();

        for(int i=1; i<=length; i++){
            for(int j=1; j<=i;j++){
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
