import java.util.Scanner;
// We have to print
// A
// BA
// CBA
// DCBA
public class ReverseTrianglePattern3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= 4;
        for (int i = 0;i<n;i++){
            char ch =(char) ('A'+i);
            for (int j = i+1;j>0;j-- ){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}
