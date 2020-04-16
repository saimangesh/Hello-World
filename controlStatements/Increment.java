package controlStatements;
public class Increment {
	public static void main(String args[])
	{
	  int c = 5;
	  System.out.printf("Before post increment:%d%n", c);
	  System.out.printf("    post incrementing:%d%n", c++);
	  System.out.printf("After post increment: %d%n", c);
	  c = 5;
	  System.out.printf("Before pre increment:%d%n", c);
	  System.out.printf("    pre incrementing:%d%n", ++c);
	  System.out.printf("After pre increment: %d%n", c);
	}
}
