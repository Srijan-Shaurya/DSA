import java.util.Scanner;
//Sum of Numbers From One to n
public class SumOfNUmbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n = input.nextInt();
        int i = 1;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}
