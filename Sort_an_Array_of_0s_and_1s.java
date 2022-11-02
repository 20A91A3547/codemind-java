import java.util.Scanner;
class Sample
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
       int count=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if(x[i]==1&&x[j]==0)
            {
                int temp=x[i];
                x[i]=x[j];
                x[j]=temp;
                i++;
                j--;
            }
           else if(x[i]==0&&x[j]==0)
           {
               i++;
           }
           else {
           j--;
           
        }
    }
    for(int a=0;a<n;a++)
    {
        System.out.print(x[a]+" ");
    }
}
}