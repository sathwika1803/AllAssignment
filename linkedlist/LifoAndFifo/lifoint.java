package linkedlist.LifoAndFifo;
import java.util.Stack; 

public class lifoint {
    public static void main(String[] args) {
    
Stack<Integer> numbers = new Stack<>(); 

 numbers.push(45); 
numbers.push(46); 
numbers.push(47); 

 System.out.println(numbers.peek());

 System.out.println(numbers.pop()); 

System.out.println(numbers.pop()); 

 System.out.println(numbers); 

 numbers.push(50); 
 System.out.println(numbers);

System.out.println(numbers.search(45));  

 System.out.println(numbers.isEmpty()); 
}
}
