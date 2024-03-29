class Solution {
    public int[] rearrangeArray(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            }
            if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}