
public class pattern1
{
    public static void main(int n)
    {
        System.out.println("The row number is "+n);
        int i=0,j=0,num;
        num=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=num;j++)
            {
                System.out.print("* ");
            }
            num=num-1;
              System.out.println(" ");
            
        }
    }
}
