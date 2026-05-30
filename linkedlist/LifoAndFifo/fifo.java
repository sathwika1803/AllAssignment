package linkedlist.LifoAndFifo;
import java.util.LinkedList; 
import java.util.Queue; 
public class fifo {
public static void main(String[] args) {
Queue<String> place = new LinkedList<>(); 
place.offer("hyd"); 
place.offer("nzb"); 
place.offer("kammareddy"); 
System.out.println(place); 
System.out.println(place.peek());  
System.out.println(place.poll());  
System.out.println(place);  
}
}
