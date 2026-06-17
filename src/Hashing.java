import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Length the array");
        int n = input.nextInt();
        System.out.println("Now Enter The Array");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
//        precompute
        int[] hash = new int[13];
        for (int i = 0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Number Of Times 2 Appears in array is "+hash[2]);

    }
}
