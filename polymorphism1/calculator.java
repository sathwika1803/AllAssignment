package polymorphism1;

public class calculator {
    public  void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(double a,double b){
       System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        calculator calculator=new calculator();
        calculator.add(10,20);
        calculator.add(3.0,4.1);
        calculator.add(2,3,4);
       
    }
}
