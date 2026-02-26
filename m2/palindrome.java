package m2;
import java.util.Scanner;

public class palindrome {
    static boolean isPalindrome(String str) {
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }

            return str.equals(rev);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            if (isPalindrome(str))
                System.out.println("It is a Palindrome");
            else
                System.out.println("It is Not a Palindrome");

            sc.close();
        }
    }