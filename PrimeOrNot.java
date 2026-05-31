import java.util.Scanner;
public class PrimeOrNot {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        boolean isPrime = true ;
        int num1 = input.nextInt();
        if(num1<=1){
            isPrime=false;
        }
        for (int i = 2;i*i<=num1;i++){
            if(num1%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("prime");
        } else{
            System.out.println("Not Prime");
        }
    }
}