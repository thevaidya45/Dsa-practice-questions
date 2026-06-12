import java.util.*;
class smallest_04{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you want to enter");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int min=0;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        int j=0;
        int result[]=new int[arr.length-1];
        for(int i=0;i<n;i++){
           if(i!=min){
            result[j++]=arr[i];
           }
        }
        for(int i=0;i<result.length;i++){
             System.out.print(result[i]+" ");
        }

    }
}