public class BankAccount {
    String accountHolder;
    int Balance;
    public BankAccount( String accountHolder,int Balance){
      this.accountHolder=accountHolder;
      this.Balance=Balance;

    }
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount("Sathwika",3000);
       acc1.displaybalance();

        acc1.deposit(2000);
         acc1.withdraw(1000);
          
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
