public class Overriding3
{
  public static void main(String[]args)
   {
        
        
	BankAccount B1 = new BankAccount(30000);
	BankAccount C1 = new CheckingAccount(30000,6000, 500); 
	BankAccount S1 = new SavingAccount(30000,4000, 100); 
 
	B1.deposit();
	C1.withDraw();
	S1.withDraw();
   }
}
        

class BankAccount
{  
        protected int depositAmount;
	protected int withdrawallimit;
	protected int fee;

  public BankAccount(int da)
   {
	depositAmount = da;
   }
	

  public void deposit()
   {
	System.out.println("Deposit amount  =" + depositAmount);
   }

  public void withDraw()
   {
	System.out.println("With drawal limit =" + withdrawallimit);
	System.out.println("Fee =" + fee);
   }
}

class CheckingAccount extends BankAccount
{

  public CheckingAccount(int da,int w, int f)
   {	
	super(da);
	withdrawallimit =w;
	fee = f;
   }

  public void withDraw()
   {
	System.out.println("With drawal limit =" + withdrawallimit);
	System.out.println("Fee =" + fee);
   }
}


class SavingAccount extends BankAccount
{

  public SavingAccount(int da,int w, int f)
   {

	super(da);
	withdrawallimit =w;
	fee = f;
   }
  public void withDraw()
   {
 	System.out.println("With drawal limit =" + withdrawallimit);
	System.out.println("Fee =" + fee);
   }
}