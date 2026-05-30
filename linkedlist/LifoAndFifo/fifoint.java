package linkedlist.LifoAndFifo;
import java.util.LinkedList; 
import java.util.Queue; 

public class fifoint {
    public static void main(String[] args) {
Queue<Integer> num = new LinkedList<>(); 
num.offer(34); 
num.offer(56); 
num.offer(121); 
System.out.println(num); 
System.out.println(num.peek());  
System.out.println(num.poll());  
System.out.println(num);  
}
}
