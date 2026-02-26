package m3;

public class Overrriding {
        void show() {
            System.out.println("Parent method");
        }
    }

    class Child extends Overrriding {
        void show() {
            System.out.println("Child method");
        }

        public static void main(String[] args) {
            Overrriding obj = new Child();
            obj.show();
        }
    }