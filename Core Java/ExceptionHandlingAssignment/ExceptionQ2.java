
public class ExceptionQ2 {
	public static void main(String[] args)
	{
		int a=10,b=0;
		try {
			try 
		    {
				System.out.println(a/b);
			} 
		    catch (ArithmeticException e)
		    {
				
				System.out.println("Division by Zero");
			}
			throw new UnsupportedOperationException();
		}
		 catch(UnsupportedOperationException e)
		{
			 System.out.println("You Can't Divide by Zero");
			
		}
	    
	    
		
	}

}