package m3;

public class inheritence {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog extends inheritence {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    class inhertancedemo {
        public static void main(String[] args) {

            Dog d = new Dog();

            d.eat();   // inherited method
            d.bark();  // own method
        }
    }