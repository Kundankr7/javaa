
package sample;

public class Exception_Handling
{
	public static void main(String[] args) {
		try{
		   
		                                                  //  throws the exception 
		  int a = 10;
		  int b = 0;
		  int div = a/b;
		  System.out.println("Division is :"+div);
		  
		}
		catch(ArithmeticException e){
		    
		 System.out.println("my error:"+e);                        //solving or debugging
		    
		}
		finally{
		    
		   //always executing 
		   	 System.out.println(" my error is solving....."); 
		}
	}
}