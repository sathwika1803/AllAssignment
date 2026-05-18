package encapsulation1;

public class mobile1 {
    public static void main(String[] args) {
        mobile m1=new mobile();
        m1.setBrand("apple");
        m1.setPrice(34556);
        System.out.println(m1.getBrand());
        System.out.println(m1.getPrice());
    }
}
