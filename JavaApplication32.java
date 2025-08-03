import java.util.Scanner;

public class JavaApplication32 
{
    public static void main(String[] args) 
    {
        BankAccount bank1 = new BankAccount();
        bank1.deposit();     
        
        BankAccount saccount1 = new SavingAccount();
        saccount1.withdraw(5000, 500);
        
        BankAccount caccount1 = new CheckingAccount();
        caccount1.withdraw(10000, 600);
       
        
    }
    
}

class BankAccount
{
    protected int accountNo;
    protected double amount;
    protected double withdraw;
    Scanner input = new Scanner(System.in);
    
    public BankAccount()
    {
        System.out.println("Enter Account No :");
        accountNo = input.nextInt();
        System.out.println("Account No :"+accountNo);
    }
   
    public void deposit()
    {
      System.out.println("Enter Amount :");
      amount = input.nextInt();
      System.out.println("Deposit Amount :"+amount);
    }
    public void withdraw (int limit,int fee)
    {
        System.out.println("Withdraw limit: "+limit);
        System.out.println("Withdraw Fee :"+fee);
    }
}
class SavingAccount extends BankAccount
{
    @Override
    public void withdraw (int limit,int fee)
    {
       System.out.println("Withdraw limit: "+limit);
       System.out.println("Withdraw Fee :"+fee); 
    }
}

class CheckingAccount extends BankAccount
{
    @Override
    public void withdraw (int limit,int fee)
    {
       System.out.println("Withdraw limit: "+limit);
       System.out.println("Withdraw Fee :"+fee); 
    }
}
