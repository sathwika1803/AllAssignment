public class mobile {
    String brand;
    String camera;
    String model;
    double price;
    int ram;
    int rom;
    public mobile(String brand,String camera,String model,int price,int ram,int rom){
       this.brand=brand;
       this.camera=camera;
       this.model=model;
       this.price=price;
       this.ram=ram;
       this.rom=rom;


    }

public static void main(String[] args) {
    mobile m1=new mobile("Samsung","200mp","SamsungGalaxyS24Ultra",129999,12,256);
    mobile m2=new mobile("Apple","48mp","iphone15ProMax",159900,8,256);
    m1.call();
    m2.calling();


}
public void call(){
    System.out.println("Brand: "+brand+" camera: "+camera+" model: "+model+" price: "+price+" ram: "+ram+" rom: "+rom);
}
public int calling(){
    return ram;
}
}
