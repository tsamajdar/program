

public class pattern2
{
    public static void main(int n)
    {
        System.out.println("The row number is "+n);
        int i=0,j=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
              System.out.println(" ");
            
        }
    }
}
