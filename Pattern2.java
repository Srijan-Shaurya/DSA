import java.util.Scanner;
//We Have to print for the code of
// A B C
// D E F
// G H I This Pattern
public class Pattern2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of lines: ");
        int n = input.nextInt();
        char ch = 'A';
        for(int i = 0;i<n;i++){
            for (int j= 0;j<n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println(" ");
        }
    }
}
