class ExceptionDemo
{
  public static void main(String args[] )
   {
       int d= 0;
      try
      {
        if(d==0)
        {throw new ArithmeticException("Divide By Zero error");}
      }
      catch(ArithmeticException h)
      {System.out.println(h);}
      catch(ArrayIndexOutOfBoundsException h)
       {System.out.println(h);}
     System.out.println("rest of the code will be executed --");
   }
}