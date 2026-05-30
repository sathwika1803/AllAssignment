package set;
import java.util.LinkedHashSet; 

public class linkedhash {
    

 public static void main(String[] args) {
    
 

LinkedHashSet<String> grade = new LinkedHashSet<>(); 

grade.add("A"); 

grade.add(" B"); 

grade.add("C"); 

grade.add("A"); // Ignored 

 

System.out.println(grade); 
}
}
