import java.util.Scanner;
//Sum of All Odd Numbers
public class SumOfAllOddNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
