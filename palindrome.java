import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int origin = n;
        int rev = 0;
        while(n!=0){
            int ld = n % 10;
            rev = rev*10+ld;
            n=n/10;
        }
        if(rev==origin){
            System.out.print(true);
        }else{
            System.out.println(false);
        }
    }
}
