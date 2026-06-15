package exception;

public class arithmeticException {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int a=x+y;
        int b=x-y;
        System.out.println(a);
        System.out.println(b);
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        System.out.println(y/x);
    }
}
