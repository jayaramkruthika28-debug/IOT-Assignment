package m2;

public class overloading {
        static int add(int a, int b) {
            return a + b;
        }

        static double add(double a, double b) {
            return a + b;
        }

        static int add(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {

            System.out.println("Sum of 2 integers: " + add(9, 12));
            System.out.println("Sum of 2 doubles: " + add(5.2, 2.8));
            System.out.println("Sum of 3 integers: " + add(2, 3, 4));
        }
    }