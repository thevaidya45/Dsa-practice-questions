import java.util.*;
public class sumofrange_06 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the starting range");
        int start=sc.nextInt();
        System.out.println( "Enter the end range");;
        int end=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        System.out.println("ENter aRRAy elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(start>=0 && end<=n){
            for(int i=start;i<=end;i++){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
