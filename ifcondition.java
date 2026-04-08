public class ifcondition {
    static int number=200;
    public static void main(String[] args) {
        if (number>0){
            System.out.println("Positive number");
        }
        if (number<0){
            System.out.println("negative number");
        }
        if (number==0){
            System.out.println("Zero");
        }
        if (number%2==0){
            System.out.println("even Number");
        }
        if (number%2==1){
            System.out.println("odd number");
        }
        if (number>100){
            System.out.println("large number");
        }
    }
}
