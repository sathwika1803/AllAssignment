package forLoop;

public class pyramid {
    public static void main(String[] args) {
        int a=5;
        for (int i=1;i<=a;i++){
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
