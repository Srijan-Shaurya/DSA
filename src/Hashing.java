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
        int[] hash = new int[1000000000];
        for (int i = 0;i<n;i++){
            hash[arr[i]]+=1;
        }
//        fetching
        System.out.println("Number Of Times 2 Appears in array is "+hash[2]);

    }
}
/*
 When You Are using hash you can only give upto 10^6 in main and 10^7 globally it means in function
 */