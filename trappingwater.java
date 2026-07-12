import java.net.SocketPermission;
import java.util.*;
public class trappingwater {
    public static int trap(int [] height){
        int left=0;
        int right=height.length-1;
        int rightmax=0,leftmax=0;
        int water=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    water+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    water+=rightmax-height[right];
                }
            right--;
            }
        }
        return water;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result =trap(arr);
        System.out.println("The water is ="+result);
    }
}
