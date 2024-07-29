import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=scanner.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("resultant output is: ");
        int max=-1;
        for(int i=size-1;i>-1;i--){
            int temp=arr[i];
            if(temp>=max){
                arr[i]=max;
                max=temp;
            }
            else arr[i]=max;
        }

        System.out.print(Arrays.toString(arr));
    }
}