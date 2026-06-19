import java.util.Scanner;

public class AllElementHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                String s = input.nextLine();
                int[] hash = new int[256];
                char c = input.next().charAt(0);
                for (int i = 0;i<s.length();i++){
                    hash[s.charAt(i)]++;
                }
                System.out.println(hash[c]);
        }
    }
