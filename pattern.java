public class pattern
{
    public static void main(int n)
    {
        System.out.println("The row number is "+n);
        int i=0,j=0,num;   
         
        for(i=1;i<=n;i++)
        {
            // printing blank space in each row before *
             for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
         
                
            }
              // printing * in each row
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            // enter new line
              System.out.println(" ");
            
        }
    }
}

     