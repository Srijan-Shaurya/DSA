import java.util.Scanner;

public class TrianglePattern3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Line:");
        int n = input.nextInt();
        char ch = 'A';
        for (int i = 0;i<n;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
