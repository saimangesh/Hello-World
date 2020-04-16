
import java.util.Scanner;
public class AccountTest
{
  public static void main(String args[])
  {
		Account mAccount = new Account("John",40.88);
		Account mAccount1 = new Account("Mangesh",20.00);
		System.out.println(mAccount.getName() + " Balance  is " + mAccount.getBalance());
		System.out.println(mAccount1.getName() + " Balance  is " + mAccount1.getBalance());
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter the amount to be deposited on account1: ");
		double x = input.nextDouble();
		System.out.println("Adding " + x + " to Account1");
		System.out.println();
		mAccount.deposit(x);
		System.out.println(mAccount.getName() + " Balance  is " + mAccount.getBalance());
		System.out.println(mAccount1.getName() + " Balance  is " + mAccount1.getBalance());
		System.out.println("Enter the amount to be deposited on account2: ");
		x = input2.nextDouble();
		mAccount1.deposit(x);
		if(x<0)
		   System.out.println("Adding " + x + " to Account1 is not posssible");
		else
			System.out.println("Adding " + x + " to Account1");
		System.out.println();
		System.out.println(mAccount.getName() + " Balance  is " + mAccount.getBalance());
		System.out.println(mAccount1.getName() + " Balance  is " + mAccount1.getBalance());
  }
}