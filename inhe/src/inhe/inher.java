package inhe;
class BankAccount{
	int acNo;
	String acName,acEmail,acPhone;
	double AcBal;
	
	public BankAccount(int acNO, String acName,String acPhone,String acEmail,double AcBal)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.AcBal=AcBal;
	}
	
	public void accountHolder (){
		System.out.println("Account Number:"+acNo);
		System.out.println("Account Number:"+acName);
		System.out.println("Account Number:"+acPhone);
		System.out.println("Account Number:"+acEmail);
		System.out.println("Account Number:"+AcBal);
		
		
		
	}
	public void deposit(double amount) {
		AcBal+=amount;
		System.out.println("Deposited:"+amount);
	}
	public void displayBalance() {
		System.out.println("Account Number:"+acNo+"Balance"+AcBal);
	}
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        super(acNo, acName, acPhone, acEmail, AcBal);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
        super(acNo, acName, acPhone, acEmail, AcBal);
    }
public class inher {

	public static void main(String[] args) {
		 System.out.println("SAVING ACCOUNT DETAILS");
         SavingsAccount sac = new SavingsAccount(1, "Ann Kamau", "0711100011", "faith@wamuyu", 1000);
         sac.accountHolder();
         sac.deposit(500);
         sac.displayBalance();

         System.out.println("\nCURRENT ACCOUNT DETAILS");
         CurrentAccount cac = new CurrentAccount(2, "Favour", "074466667", "faith@wamuyu", 100);
         cac.accountHolder();
         cac.deposit(300);
         cac.displayBalance();
		
	}

}
