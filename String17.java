class Solution {
    public int longestPalindrome(String s) {

        int[] count = new int[128];

        // Count each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int result = 0;
        boolean hasOdd = false;

        // Use pairs
        for (int i = 0; i < 128; i++) {

            result += (count[i] / 2) * 2;

            // Check if an odd character exists
            if (count[i] % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd character can be placed in the center
        if (hasOdd) {
            result++;
        }

        return result;
    }
}