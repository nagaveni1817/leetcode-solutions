class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            // include right element
            if (nums[right] == 0) {
                zeroCount++;
            }

            // shrink window if more than one zero
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // window length minus one deleted element
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
