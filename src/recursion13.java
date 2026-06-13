import java.util.Scanner;
//Reverse an array using recursion
public class recursion13 {
    public static void reverse(int[] arr,int start,int end) {
        if (start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        reverse(arr,0,n-1);
        System.out.println("Reversed Array");
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
