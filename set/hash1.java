package set;


  import java.util.HashSet; 
 import java.util.List;

public class hash1 {
   
    public static void main(String[] args) {
        
    
     
    
    HashSet<Integer> voters = new HashSet<>(); 
    
    voters.add(12); 
    
    voters.add(13); 
    
    voters.add(15); 
    
    voters.add(12);  
     voters.add(13); 
    
    voters.add(67);  

    
     
    
    System.out.println(voters.size()); 
    
    System.out.println(voters.contains(345)); 
    
    voters.remove(67); 
    
     
     // Set Operations — very useful! 
    
    HashSet<Integer> setA = new HashSet<>(List.of(56,67,89)); 
    
    HashSet<Integer> setB = new HashSet<>(List.of(56,67,77)); 
    
     
    
    
    
    HashSet<Integer> union = new HashSet<>(setA); 
    
    union.addAll(setB); 
    
    System.out.println("Union: " + union); 
    
     
    
   
    
    HashSet<Integer> intersection = new HashSet<>(setA); 
    
    intersection.retainAll(setB); 
    
    System.out.println("Common: " + intersection); // [Alice] 
    
     
    
    
    
    HashSet<Integer> diff = new HashSet<>(setA); 
    
    diff.removeAll(setB); 
    
    System.out.println("Only in A: " + diff);

}
}
  

