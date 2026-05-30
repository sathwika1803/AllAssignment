package set;
 import java.util.HashSet; 
 import java.util.List;

public class hash {
   
    public static void main(String[] args) {
        
    
     
    
    HashSet<String> voters = new HashSet<>(); 
    
    voters.add("sathwika"); 
    
    voters.add("chinni"); 
    
    voters.add("papa"); 
    
    voters.add("sathwika");  
    
     
    
    System.out.println(voters.size()); 
    
    System.out.println(voters.contains("papa")); 
    
    voters.remove("sathwika"); 
    
     
     // Set Operations — very useful! 
    
    HashSet<String> setA = new HashSet<>(List.of("sathwika","chinni","papa")); 
    
    HashSet<String> setB = new HashSet<>(List.of("sathwika","sweety","sanddy")); 
    
     
    
    
    
    HashSet<String> union = new HashSet<>(setA); 
    
    union.addAll(setB); 
    
    System.out.println("Union: " + union); 
    
     
    
   
    
    HashSet<String> intersection = new HashSet<>(setA); 
    
    intersection.retainAll(setB); 
    
    System.out.println("Common: " + intersection); // [Alice] 
    
     
    
    
    
    HashSet<String> diff = new HashSet<>(setA); 
    
    diff.removeAll(setB); 
    
    System.out.println("Only in A: " + diff);

}
}
