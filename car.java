public class car{
    String brand;
    String model;
    int year;
    public static void main(String[] args) {
        car carr=new car();
            carr.brand="Honda";
            carr.model="City";
            carr.year=2023;
        car carrr=new car();
             carrr.brand="Mahindra";
            carrr.model="Thar";
            carrr.year=2025;
        carr.call();
    }
    public  void  call() {
        System.out.println(brand+model+year);
        
    }
}
