public class methodsss {
     public static void main(String[] args) {
    System.out.println(square(5));
    System.out.println(cube(3));
     System.out.println(largest(20,10));
     checkNumber(40);
    }
    
    
    static int square(int num) {
        return num * num;
    }
static int cube(int num) {
        return num * num * num;
    }
     static int largest(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
      static void checkNumber(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
   
}

