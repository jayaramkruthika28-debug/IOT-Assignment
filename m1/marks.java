package m1;
import java.util.Scanner;
public class marks {

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter marks (0-100): ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks");
                    return;
                }

                switch (marks / 10) {
                    case 10:
                    case 9:
                        System.out.println("Grade: A");
                        break;
                    case 8:
                        System.out.println("Grade: B");
                        break;
                    case 7:
                        System.out.println("Grade: C");
                        break;
                    case 6:
                        System.out.println("Grade: D");
                        break;
                    default:
                        System.out.println("Grade: F");
                }
            }
        }
    }
