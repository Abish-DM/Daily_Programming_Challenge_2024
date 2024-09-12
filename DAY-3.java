import java.util.*;
class Day3
{
     public static void main(String abi[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt(),ar[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("Duplicate number is:");
        int i=0;
        while(i<n)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                  System.out.println(ar[i]);
                  i=n-1;
                  break;
                }
            }
            i++;
        }
    }
}