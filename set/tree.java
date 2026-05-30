package set;
 import java.util.TreeSet; 
 import java.util.Comparator;

public class tree {
   
    public static void main(String[] args) {
        
    
     
    
    TreeSet<Integer> rank = new TreeSet<>(); 
    
    rank.add(450); 
    
    rank.add(120); 
    
    rank.add(780); 
    
    rank.add(300); 
    
     
    
    System.out.println(rank); 
    
     
    
    System.out.println(rank.first()); 
    
    System.out.println(rank.last());  
    
     
    
    // headSet — everything BELOW value 
    
    System.out.println(rank.headSet(400)); 
    
     
    
    // tailSet — everything AT or ABOVE value 
    
    System.out.println(rank.tailSet(400)); 
    
     
    
    // subSet — range [inclusive, exclusive) 
    
    System.out.println(rank.subSet(200, 500)); 
    
     
    
    
    
    TreeSet<Integer> desc = new TreeSet<>(Comparator.reverseOrder()); 
    
    desc.addAll(rank); 
    
    System.out.println(desc); 

}
}
