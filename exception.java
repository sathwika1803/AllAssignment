public class exception {
    
    public static void main(String[] args) { 
    try { 
        int result = 121 / 0;                        
        System.out.println("Result: " + result);    

        } 
        catch (ArithmeticException e) { 
                 System.out.println("Caught: " + e.getMessage());

        } 

  

    } 

} 

