public class studentObject2 {
     String name;
    int roolno;
    int Marks;
    public studentObject2( String name,int roolno,int Marks){
        this.name=name;
        this.roolno=roolno;
        this.Marks=Marks;

    }
    public static void main(String[] args) {
        studentObject2 object =new studentObject2("Sathwika",23,66);
         System.out.println(object.name+ " " + object.roolno+  " " + object.Marks);


    }
}
