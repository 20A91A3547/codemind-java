import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=(int)Math.sqrt(n);
        if((k+1)*k==n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}