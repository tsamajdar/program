public class reverse
{
    public static void main(int n)
    {
        System.out.println("The number is "+n);
        int rev=0,r=0,num=0;
        num=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
            System.out.println("The individual number is "+r);
             System.out.println("The reverse number in loop is "+rev);
                  System.out.println("The remaini ng part of number in loop is "+n);
            
        }
        System.out.println("The reversed number is "+rev);
        if(num==rev)
        {
            System.out.println("The number is a palyndrome");
        }
        else
        {
            System.out.println("The number is not a palyndrome");
        }
        
    }
           
}

