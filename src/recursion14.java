import java.util.Scanner;
public class recursion14 {
    public static void f(int[] arr,int start,int end) {
        if (start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        f(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        f(arr ,0 ,arr.length-1);
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
