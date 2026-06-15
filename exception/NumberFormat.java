package exception;

public class NumberFormat {
    public static int safe(String s,int defaultValue){
        try{
            return Integer.parseInt(s);

        }
        catch(NumberFormatException e){
            return defaultValue;
        }
    }
    public static void main(String[] args) {
        String valid1="123";
        String valid2="sathwika";
        int result1=safe(valid1,-1);
        int result2=safe(valid2,-1);
        System.out.println(result1);
        System.out.println(result2);
    }
}
