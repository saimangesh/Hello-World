package controlStatements;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count ;
     for(count = 1; count<=10 ;count++)
     {
    	 if(count==5)
    		 break;
    	 System.out.printf("%d ", count);
     }
	 System.out.printf("%nBreak loop at count %d%n", count);
	 
	 for(int count1 = 1; count1<=10 ; count1++)
	 {
		 if(count1==5)
			 continue;
    	 System.out.printf("%d ", count1);
	 }
	 System.out.printf("%n%s","Continue loop executed at count 5");
	}
}
