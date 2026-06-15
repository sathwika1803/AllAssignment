package exception;

public class multiplecatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
