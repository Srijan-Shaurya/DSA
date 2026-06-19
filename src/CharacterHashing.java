import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int[] hash = new int[26];
        for (int i = 0;i<s.length();i++){
            hash[s.charAt(i)-'A']++;
        }
        System.out.println(hash[0]);
    }
}
