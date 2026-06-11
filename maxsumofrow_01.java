import java.util.*;
public class maxsumofrow_01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxsum=Integer.MIN_VALUE;
        int maxrowindex=-1;
        for(int i=0;i<rows;i++){
            int sum=0;
             for(int j=0;j<cols;j++){
               sum+=arr[i][j];
            }
            if(sum>maxsum){
                maxsum=sum;
                maxrowindex=i;
            }
        }
        System.out.println("Max sum"+maxsum);
        System.out.println("Row discarted="+maxrowindex);
        for(int i=0;i<arr.length;i++){
            if(i==maxrowindex){
                continue;
            }
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
