import java.util.*;
class day2{
    public static void main(String ak[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=s.nextInt(),ar[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int t=1,m=0;
    for(int i=0;i<n-1;i++){
        if(ar[i]==i+1 && ar[i+1]!=i+2){
            t=0;
            m=ar[i]+1;
            break;
        }
    }
    if(t==1){
        if(ar[0]!=1 && ar[0]==2){
            m=1;
        }
        else{
            m=ar[n-1]+1;
        }
    }
        System.out.println("Missing number is : "+m);
    }
}
