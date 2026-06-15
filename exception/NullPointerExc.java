package exception;

public class NullPointerExc {
    public static void main(String[] args) {
        String fullName=null;
        try{
            int length=fullName.length();
            System.out.println(length);
        }
        catch(NullPointerException e){
            System.out.println("error: no data found for fullName");
        }

    }
}
