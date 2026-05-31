import java.util.Scanner;
// What We have to print is
// 123
// 456
// 789 in this format
public class Pattern1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Lines: ");
        int n = input.nextInt();
        int num = 1;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(num);
                if(num<8){
                    System.out.print(" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
