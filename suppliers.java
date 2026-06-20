import java.util.function.Supplier;

public class suppliers {
    
    public static void main(String[] args) {
        
    
    Supplier<String> greeting = () -> "Hello! Welcome to Modern Java!"; 

System.out.println(greeting.get());
}
}


