import java.util.*;
class array1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalsum=n*(n+1)/2;
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            
        }
        int missing=totalsum-sum;
        System.out.println("The missing number = "+missing);

    }
}