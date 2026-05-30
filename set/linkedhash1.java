package set;
import java.util.LinkedHashSet; 

public class linkedhash1 {
    public static void main(String[] args) {
    
 

LinkedHashSet<Integer> number = new LinkedHashSet<>(); 

number.add(66); 

number.add(67); 

number.add(78); 

number.add(66); // Ignored 

 

System.out.println(number); 
}
}
