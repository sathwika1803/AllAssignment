package polymorphism.encapsulation;

public class student1 {
    public static void main(String[] args) {
        student s1=new student();
        s1.setName("sathwika");
        s1.setMarks(21);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
         student s2=new student();
        s1.setName("guddu");
        s1.setMarks(19);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

    }
}
