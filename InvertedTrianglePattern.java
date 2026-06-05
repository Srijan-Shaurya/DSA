import java.util.Scanner;
//Question is to print this pattern
// 1111
//  222
//   33
//    4
public class InvertedTrianglePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 4;
        for (int i = 0;i<n;i++){
            for(int j = 0;j>=i;j++){
                System.out.print(" ");
            }
            for (int j = 0;j<n;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
