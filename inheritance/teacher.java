package inheritance;

public class teacher {
    String name;
    int id;
    teacher(String name,int id){
        this.name=name;
        this.id=id;

    }
    public void call(){
        System.out.println(name);
    }
}
