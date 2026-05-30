package linkedlist.LifoAndFifo;
 import java.util.Stack; 

public class lifo {
   
public static void main(String[] args) {
    
Stack<String> friends = new Stack<>(); 

 friends.push("vani"); 
friends.push("Vishala"); 
friends.push("vaishanvi"); 
friends.push("chinni");
friends.push("keerthi");

 System.out.println(friends.peek());

 System.out.println(friends.pop()); 

System.out.println(friends.pop()); 

 System.out.println(friends); 

 friends.push("preethi"); 
 System.out.println(friends);

System.out.println(friends.search("preethi"));  

 System.out.println(friends.isEmpty()); 
}
}
