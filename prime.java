import java.util.Scanner;

public class prime {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        for (int i = 1;i*i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
            if (n/i!=i){
                count++;
            }
        }
            if(count==2){
                System.out.print("prime");
            }else{
                System.out.print("Not a Prime Number");
            }

    }
}
