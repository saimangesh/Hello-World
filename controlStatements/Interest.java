package controlStatements;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double amount;
      double principle = 1000.0;
      double rate = 0.05;
      System.out.printf("%s%20s%n", "Year", "Amount of deposit");
      for(int year = 1;year<=10;year++)
      {
    	  amount = principle + Math.pow(1.0 + rate, year);
    	  
    	  System.out.printf("%-4d%,20.2f%n", year , amount);
      }
	}

}
