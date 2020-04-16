package controlStatements;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
    		  "Conditional And(&&)","false && false",(false && false),
    		  "false && true",(false && true),"true && false",(true && false),
    		  "true && true",(true && true));
      System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
    		  "Conditional or(||)","false || false",(false || false),
    		  "false || true",(false || true),"true && false",(true || false),
    		  "true || true",(true || true));
      System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
    		  "Boolean And(&)","false & false",(false & false),
    		  "false & true",(false & true),"true & false",(true & false),
    		  "true & true",(true & true));
      System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
    		  "Boolean inclusive or(|)","false | false",(false | false),
    		  "false | true",(false | true),"true && false",(true | false),
    		  "true | true",(true | true));
      System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
    		  "Boolean Exculsive OR(^)","false ^ false",(false ^ false),
    		  "false ^ true",(false ^ true),"true ^ false",(true ^ false),
    		  "true ^ true",(true ^ true));
      System.out.printf("%n%s%n%s: %b%n %s: %b%n", "Logical Not(!)", "(!false)", (!false),"(!true)",(!true));
	}

}
