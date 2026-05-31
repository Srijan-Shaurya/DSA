import java.util.Scanner;
// Sum of All Number from 1 to N Which Are Divisible By 3
public class DivisibilityByNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int sum = 0;
        int num = input.nextInt();
        for(int i = 1;i<=num;i++){
            if(i%3==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
