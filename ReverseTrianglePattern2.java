import java.util.Scanner;
//We have to print Characters in reverse order
//A
//BC
//DEF
//GHIJ
public class ReverseTrianglePattern2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 4;
        char ch = 'A';
        for (int i = 0;i<n;i++){
            for (int j = i+1;j>0;j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
