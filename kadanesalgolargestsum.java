import java.util.*;
class solution{
    public int abc(int arr[]){
        long maxi=Long.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return (int) maxi;
    }
}
public class kadanesalgolargestsum {
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        solution sol=new solution();
        int ans=sol.abc(arr);
        System.out.println(ans);
    }
    
}
