
public class Account
{
  private String name;
  private double balance;
  public Account(String name, double balance)
  { 
    this.name=name;
    if(balance>0)
    	this.balance=balance;
  }
  public void deposit(double amount)
  {
	  if(amount>0)
		  balance = balance + amount;
  }
  public String getName()
  {
    return name;
  }
  public double getBalance()
  {
	  return balance;
  }
}