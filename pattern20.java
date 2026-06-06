import java.util.Scanner;

public class pattern20 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int space = 2*n-2;
        for (int i = 1;i<=2*n-1;i++){
//            Stars
            int stars = i;
            if (i>n){
                stars= 2*n-i;
            }
            for (int j= 1;j<=stars;j++){
                System.out.print("*");
            }
//            Space
            for (int j = 1;j<=space;j++){
                System.out.print(" ");
            }
//            Stars
            for (int j= 1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n){
                space = space - 2;
            }
            else {
                space = space + 2;
            }
        }
    }
}
