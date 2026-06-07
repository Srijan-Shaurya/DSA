import java.util.Scanner;

public class recursion2 {
    static int count = 0;
    static void recu() {
        if(count==3){
            return;
        }
        System.out.print(count+" ");
        count++;
        recu();
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        recu();
    }
}
