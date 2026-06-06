import java.util.Scanner;
import static java.lang.Math.*;
public class Leetcode_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        long rev = 0;
        while(x!=0){
            int ld = x % 10;
            rev = (rev*10)+ld;
            if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
                System.out.print("0");
                return;
            }
            x = x/10;
        }
        System.out.print(rev);
    }
}
