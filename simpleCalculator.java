public class simpleCalculator {
    static int a=10;
    static int b=20;
    static String operator="*";
    public static void main(String[] args) {
        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                
        }



    }
}
