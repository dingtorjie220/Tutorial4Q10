// Account
/*

public class Account {

    private int accountNo;
    private String accountHolderName;
    private double balance;
    static int accountCount; 
    private static double annualInterestRate;
    
    
    public Account(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
         accountCount++;
    }
    
    public int getAccountNo(){
      return accountNo;
      }
     
     public String getAccountHolderName(){
     	return accountHolderName;
     }


    public double getBalance(){
    	return accountCount;
    }
    
    public static int getAccountCount(){
    	return accountCount;
    }
    
    public static double getAnnualInterestRate(){
    	return annualInterestRate;
    }
    
    
    public void setAccountHolderName(String accountHolderName) {
    	this.accountHolderName = accountHolderName;
    }
    
    
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    
    public void cashIn(double cash){
        balance+=cash;
    }
    
    public void cashOut(double cash){
    balance -= cash;
   }
    
    public double calaculatedInterst(){
    	 return balance * annualInterestRate;
    }
    
}


*/

// Test Account

/*

import java.util.Scanner;

public class TestAccount {
    private static Scanner scanner = new Scanner(System.in);
        
    public static void main (String[] args) {
          //todo:: create account object
         Account acc1 = new Account(909,"Ali Baba", 1000);
          
          //todo:: set Interest rate
         Account.setAnnualInterestRate(0.03);
          
          int choice;
          double amt; 
          
          do {
              choice = displayMenu();
              switch (choice ){
                  case 1:  //todo:: display balance 
                         System.out.print("Balance : " + acc1.getBalance());
                          break;
                           
                  case 2 : //todo:: request deposit amount
                           System.out.print("Enter Amount : ");
                           //todo:: cash in
                           //todo:: display balance
                           amt=scanner.nextDouble();
                            acc1.cashIn(amt);
                           System.out.println("Balance : "+acc1.getBalance());
                         
                           break;
                           
                  case 3 : System.out.print("Enter Amount : ");
                           //todo:: cash out
                           //todo:: display balance
                            amt = scanner.nextDouble();
                           acc1.cashOut(amt);
                           System.out.println("Balance: "+acc1.getBalance() );
                           break;
                           
                  case 4 : //todo:: display interest amount
                            System.out.println("Interest amount: " + acc1.calaculatedInterst());
                            break;
              }
          }while (choice != 5);
    }
      
    public static int displayMenu(){
          System.out.println("\nMain Menu");
          System.out.println("1 : Check balance");
          System.out.println("2 : Cash In"); 
          System.out.println("3 : Cash Out");
          System.out.println("4 : Interest"); 
          System.out.println("5 : Exit"); 
          System.out.print("Enter a choice : "); 
          
          //todo:: read and return selection
           int choice=scanner.nextInt();
            return choice; 
     
    }  
}



*/
