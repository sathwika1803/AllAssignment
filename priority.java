import java.util.PriorityQueue; 
public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> erQueue = new PriorityQueue<>(); 

erQueue.offer(7);  
erQueue.offer(32);  

erQueue.offer(77);   

 

System.out.println(erQueue.peek());

 

while (!erQueue.isEmpty()) { 

    System.out.println("Treating: " + erQueue.poll()); 

} 
    }
}
