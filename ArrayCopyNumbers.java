import java.util.Scanner;

public class ArrayCopyNumbers {
    
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner myObj = new Scanner(System.in);
        int len = myObj.nextInt();

        int a[] = new int[len];

        System.out.println("Enter the elements of the array");
        for(int i=0; i< len; i++ ){
            a[i] = myObj.nextInt();
        }

        int b[] = new int[len];

        System.out.println("The copied array is ");
        for(int i=0;i<len;i++){
            b[i] = a[i];
            System.out.println(b[i] + " ");
        }




    }
}
