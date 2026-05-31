import java.util.Scanner;
// The Question is We have to print
// 1
// 21
// 321
// 4321
public class ReverseTrianglePattern1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Lines: ");
        int n = input.nextInt();
        for (int i = 0;i<n;i++){
            for (int j = i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}