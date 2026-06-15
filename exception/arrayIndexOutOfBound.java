package exception;

public class arrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] numbers={1,2,3};
        System.out.println(numbers[0]);
        try{
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
        }
        catch(ArrayIndexOutOfBoundsException   e){
               System.out.println("error:"+e.getMessage());
        }
        System.out.println("the code is done");
    }
}
 