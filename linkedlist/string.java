package linkedlist;
import java.util.LinkedList; 

public class string {
    

 public static void main(String[] args) {
    
 

LinkedList<String> movie = new LinkedList<>(); 

movie.add("100% Love"); 

movie.add("manam"); 

movie.add("kerala story"); 

 

movie.addFirst("Radhe shyam"); 

movie.addLast("Salaar");    

 

System.out.println(movie.getFirst()); 

System.out.println(movie.getLast());  

 

movie.removeFirst();  

movie.removeLast();   

 

System.out.println(movie.peek());  

System.out.println(movie.poll());  
}
}
