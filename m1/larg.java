package m1;

public class larg {
    public static void main(String[] args){
        int a=10;
        int b=25;
        int c=15;
        if(a>b&&a>c){
            System.out.println("a is largest");
        }
        else if(b>c){
            System.out.println("Largest number is:"+b);
        }
        else{
            System.out.println("Largestnumber is:"+c);
        }
    }
}

