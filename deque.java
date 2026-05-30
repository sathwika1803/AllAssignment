import java.util.ArrayDeque; 
import java.util.Deque; 
public class deque {
    
public static void main(String[] args) {
Deque<String> team = new ArrayDeque<>(); 

 team.addFirst("akshay"); 
team.addFirst("laddu");
team.addFirst("sathwika");   
team.addLast("vyshu");    
team.addLast("meghana"); 
System.out.println(team);
 System.out.println(team.peekFirst()); 
System.out.println(team.peekLast()); 

team.removeFirst(); 
team.removeLast();  
System.out.println(team); 
}
}