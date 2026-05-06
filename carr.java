public class carr {
     String brand;
    String model;
    int year;
    public carr( String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;


    }

    public static void main(String[] args) {
        carr c1=new carr("Mahindra","city",2023);
        carr c2 =new carr("Hyundai","creta",2024);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
         System.out.println(c2.brand);
        System.out.println(c2.model);
        System.out.println(c2.year);
        
    }
}
