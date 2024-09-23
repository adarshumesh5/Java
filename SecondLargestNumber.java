import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner myObj = new Scanner(System.in);
        int len = myObj.nextInt();
        int temp;
        int a[] = new int[len];


        System.out.println("Enter the elements of the array");
        for(int i=0; i< len; i++ ){
            a[i] = myObj.nextInt();
        }
        for(int i =0;i<len;i++){
            for(int j=i+1; j<len;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] =a[j];
                    a[j]= temp;
                }

            }

        }
        System.out.println("The second largest number is" + a[1]);
    }
}
