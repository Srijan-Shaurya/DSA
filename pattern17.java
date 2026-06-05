import java.util.Scanner;

public class pattern17 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = 6;
        for (int i = 0;i<n;i++){
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
//            Inner Space
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
//          Inner Character
            for (int j = 1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }
            }
//            Inner Space
            for (int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
