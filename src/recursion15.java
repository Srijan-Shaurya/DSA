import java.util.Scanner;
//Check if a given string is a palindrome or not
public class recursion15 {
    public static boolean f(String arr,int start,int end) {
        if (start>end){
            return true;
        }
        if(arr.charAt(start)!=arr.charAt(end)){
            return false;
        }
        return f(arr,start+1,end-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr = input.nextLine();
            if (f(arr,0,arr.length()-1)){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not Palindrome");
            }
    }
}