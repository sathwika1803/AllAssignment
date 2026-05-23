package polymorphism1;

public class main {
    public static void main(String[] args) {
        animal[] animal={new cat(),new dog(),new cow()};
        for (animal a:animal){
            System.out.println(a.sound());
        }
    }
}
