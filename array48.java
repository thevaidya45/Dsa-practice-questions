import java.util.*;
public class array48 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target");
        int target=sc.nextInt();
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
        int needed=target-arr[i];
        if(set.contains(needed)){
            System.out.println(needed+"+"+arr[i]+"="+target);
        };
       }
       set.add(arr[i]);

    }
}
