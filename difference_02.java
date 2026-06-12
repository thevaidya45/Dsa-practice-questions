import java.util.*;
public class difference_02 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int diff;
        diff=arr[arr.length-1]-arr[0];
        System.out.println(diff);
    }
}
