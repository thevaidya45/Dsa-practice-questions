import java.util.*;
public class leaderarray07 {
    public static List<Integer> findleader(int []arr){
        List<Integer> leader=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                leader.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(leader);
        return leader;
    } 
    public static void main(String args[]){
        int arr[]={16,17,4,3,5,2};
        List<Integer> result =findleader(arr);
        System.out.println(result);
    }
}