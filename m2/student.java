package m2;

public class student{
        String name;
        int age;
        student() {
            name = "Unknown";
            age = 0;
        }
        student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {

            student s1 = new student();
            student s2 = new student("ABC", 43);

            System.out.println("Student 1:");
            s1.display();

            System.out.println("\nStudent 2:");
            s2.display();
        }
    }