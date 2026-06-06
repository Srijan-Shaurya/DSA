import java.util.Scanner;
//**********
//****  ****
//***    ***
//**      **
//*        *
//*        *
//**      **
//***    ***
//****  ****
//**********
public class pattern19 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = 5;
        for (int i = 0;i<n;i++){
//            Stars
            for (int j = n;j>i;j--){
                System.out.print("*");
            }
//            Space
            for (int j = 1;j<=2*i;j++){
                System.out.print(" ");
            }
//            Stars
            for (int j = n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1;i<=n;i++){
//          Stars
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
//          Space
            for (int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
//          Stars
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
