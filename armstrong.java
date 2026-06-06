import java.util.Scanner;

public class armstrong {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nu = n;
        int rev = 0;
        int sum = 0;
        while(n!=0){
            int ld = n % 10;
//            rev = rev *10 + ld;
            sum = sum +(ld*ld*ld);
            n=n/10;
        }
        if(sum==nu){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
