import java.util.Scanner;
// The Question is We Have To Print
// 1
// 12
// 123
// 1234
public class TrianglePattern4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Lines: ");
        int n= input.nextInt();
        for (int i = 0;i<n;i++){
            int num = 1;
            for (int j = 0;j<i+1;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
