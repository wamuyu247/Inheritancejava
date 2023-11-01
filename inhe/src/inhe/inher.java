package inhe;
class BankAccount{
	int acNo,acPhone;
	String acName,acEmail;
	double AcBal;
	
	public BankAccount(int acNO, String acName,int acPhone,String acEmail,double AcBal)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.AcBal=AcBal;
	}
	
	public void accountHolder() {
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
}

public class inher {

	public static void main(String[] args) {
		BankAccount c=new BankAccount(0111,"FAITH",0111,"faith@",1000);
		
	}

}
