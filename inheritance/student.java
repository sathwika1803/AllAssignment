package inheritance;

public class student extends teacher {
    String sname;
    student(String name,int id,String sname){
        super(name,id);
        this.sname=sname;

    }
    public void calling(){
        System.out.println(sname);
    }
}
