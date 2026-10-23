package Day3_Oct21;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		SavingsAccount sa=new SavingsAccount();
		System.out.print("Enter the Account number:");
		sa.acc_no=sc.nextInt();
		System.out.print("Enter the Balance:");
		sa.bal=sc.nextInt();
		sa.savedisplay();
		
		CurrentAccount ca=new CurrentAccount();
		System.out.print("Enter the Account number:");
		ca.acc_no=sc.nextInt();
		System.out.print("Enter the Balance:");
		ca.bal=sc.nextInt();
		ca.currentdisplay();

	}

}

class BankAccount{
	int acc_no;
	int bal;
}

class SavingsAccount extends BankAccount{
	void savedisplay(){
		System.out.println("Account Number:"+this.acc_no);
		System.out.println("Balance:"+this.bal);
	}
}

class CurrentAccount extends BankAccount{
	void currentdisplay(){
		System.out.println("Account Number:"+this.acc_no);
		System.out.println("Balance:"+this.bal);
	}
}
