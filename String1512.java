import java.util.*;

public class String1512 {

    public static int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : nums) {

            if (map.containsKey(num)) {
                count += map.get(num);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(numIdenticalPairs(nums));

        sc.close();
    }
}