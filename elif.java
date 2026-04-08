public class elif {
    static int units=200;
    public static void main(String[] args) {
        
        if (units>0 && units<100){
            System.out.println("1.5 units");
        }
        else if(units>=100 && units<200){
            System.out.println("2.5 units");
        }
        else if(units>=200 && units <300){
            System.out.println("4 units");
        }
        else{
            System.out.println("6 units");
        }
    }
}
