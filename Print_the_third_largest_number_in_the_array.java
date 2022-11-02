import java.util.*;
class TestRun{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int count=1;
            int n = sc.nextInt();
            Integer arr[]=new Integer[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());;
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]!=arr[i+1]){
                    count++;
                }
                if(count== 3){
                    System.out.println(arr[i+1]);
                    System.exit(0);
                }
            }
            System.out.print("It is not possible");
    }
}
