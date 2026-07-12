import java.util.*;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int currentArea = Math.min(height[left], height[right]) * width;

            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = maxArea(height);

        System.out.println("Maximum Water = " + result);

        sc.close();
    }
}