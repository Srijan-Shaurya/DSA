import java.util.Scanner;

public class UpperCase {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Number: ");
        int First_number = input.nextInt();
        System.out.print("Enter The Ending Number: ");
        int Second_Number = input.nextInt();
        while(First_number<=Second_Number){
            System.out.println(First_number);
            First_number++;
        }
    }
}
