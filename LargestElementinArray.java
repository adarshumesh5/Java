import java.util.Scanner;

public class LargestElementinArray {
    
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner myObj = new Scanner(System.in);
        int len = myObj.nextInt();
        int large =-999999999;

        int a[] = new int[len];

        System.out.println("Enter the elements of the array");
        for(int i=0; i< len; i++ ){
            a[i] = myObj.nextInt();
        }


        for(int i=0;i<len;i++){
            if(a[i] > large){
                large =a[i];
            }
        }


        System.out.println("The largest number is " + large);

    }
}
