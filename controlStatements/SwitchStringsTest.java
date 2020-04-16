package controlStatements;

public class SwitchStringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SwitchStrings policy1 = new SwitchStrings(1111111,"Ford Ecosport","MA");
      SwitchStrings policy2 = new SwitchStrings(2222222,"Honda City","NK");
      
      policyInNoFaultState(policy1);
      policyInNoFaultState(policy2);
	}
    public static void  policyInNoFaultState(SwitchStrings policy)
    {
    	System.out.printf("%n%s", "The auto policy : ");
    	System.out.printf("Account:# %d%n Car : %s%n State: %s %s no-fault state ",
    			policy.getAccountNumber(),policy.getMakeAndModel(),
    			policy.getState(),
    			(policy.isNotFault() ? "is" : "is not"));
    }
}
