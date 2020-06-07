public class prime
{
    public static void main(int n)
    {
       // System.out.println("The numbers are "+n1+","+n2);
        int i,num=0,r=0,hcf=0,count=0,flag=0;
         System.out.println("The prime numbers are:");
 

       for (i = 2; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==1 )
	  {
	     //Appended the Prime number to the String
	     System.out.print(i+" ");
	  }	
       }	
    
      
}
}