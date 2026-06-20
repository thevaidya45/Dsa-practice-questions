import java.util.*;
public class longestconsarray_08 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int max=1;
        int current=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                current++;
            }
            else{
                max=Math.max(max,current);
                current=1;
            }
        }
        max=Math.max(max,current);
        System.out.println("Longest sub ="+max);
    } 
}
