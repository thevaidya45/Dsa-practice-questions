import java.util.*;
public class array43 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int row=0;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                row=i;
            }


        }
        System.out.println("MAX ROW IS  "+row);
        System.out.println("Max sum is + "+max);

      }
}
