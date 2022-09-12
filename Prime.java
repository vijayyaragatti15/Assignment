import java.util.*;
class NumberNotPrimeException extends Exception {
} 
class NegativeNumberNotAllowedException extends Exception {
}
class Prime {
	public static void main(String args[]) {		
		Scanner in=new Scanner(System.in);
		int n,flag=0;
		System.out.println("ENTER THE NUMBER\n");
		n=in.nextInt();		
		try {	
			if(n<0)
			{
				throw new NegativeNumberNotAllowedException();
			}		
		} catch(NegativeNumberNotAllowedException e) {
            System.out.println("The given number is negative :" +e.toString());
        }		try {
				     if(n==0 || n==1)
		             {
				           flag=1;
			         }
			
			         for(int i=2;i<=n/2;i++)
			         {
				         if(n%i==0)
				         {
					        flag=1;
					        break;
				         }
			        }			
			        if(flag==1)
			        {
				       throw new NumberNotPrimeException();
			        }			
			
	    } catch(NumberNotPrimeException p) {
            System.out.println("The given number is not prime :" +p.toString());
        }
    }	
}
