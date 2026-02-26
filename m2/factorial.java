package m2;


    import java.util.Scanner;
public class factorial {


        static int calculateFactorial(int n) {
            if (n == 0 || n == 1)
                return 1;
            else
                return n * calculateFactorial(n - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Factorial of " + num + " is: " + calculateFactorial(num));

            sc.close();
        }
    }