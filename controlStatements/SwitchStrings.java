package controlStatements;

public class SwitchStrings {
    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    public SwitchStrings(int accountNumber,String makeAndModel,String state)
    {
    	if(accountNumber>5)
    		this.accountNumber = accountNumber;
    	this.makeAndModel = makeAndModel;
    	this.state = state;
    }
    public String getMakeAndModel()
    {
    	return makeAndModel;
    }
    public int getAccountNumber()
    {
    	return accountNumber;
    }
    public String getState()
    {
    	return state;
    }
    public boolean isNotFault()
    {
    	boolean NoFaultState;
    	
    	switch(getState())
    	{
    	case "MA":
    	case "NJ":
    	case "NY":
    	case "PA":
    		NoFaultState=true;
    		break;
    	default:
    		NoFaultState=false;
    		break;	
    	}
    	return NoFaultState;
    }
    
}
