
    public class vehicle1 extends vehicle{
        public String fuel;
        public vehicle1(String brand,int speed,String fuel){
            super(brand, speed);
            this.fuel=fuel;

        }
         public  void fuel(){
        System.out.println(fuel);
    }
}
