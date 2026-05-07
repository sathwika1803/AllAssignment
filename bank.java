public class bank {
   
    String accountHolder;
    int Balance;
    public bank( String accountHolder,int Balance){
      this.accountHolder=accountHolder;
      this.Balance=Balance;

    }
    public static void main(String[] args) {
        bank acc1=new bank("Sathwika",3000);
       acc1.displaybalance();

        acc1.deposit(4000);
         acc1.withdraw(2000);
          
    }
    public void deposit(int amount){
      Balance=Balance+amount;
      System.out.println(Balance);
    }
    public void withdraw(int amount){
      Balance=Balance-amount;
      System.out.println(Balance);
    }
     public void displaybalance(){
      
      System.out.println(Balance);
    }


}


