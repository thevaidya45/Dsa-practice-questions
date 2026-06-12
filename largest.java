import java.util.*;
public class largest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=arr[0];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest number is = "+max);
    }
}