class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        int ans = 0;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        
        int i = 0;
        int j = nums2.length-1;        
        while(i < nums1.length && j >= 0)
        {
            ans += nums1[i] * nums2[j];
            i++;
            j--;
        }
        
        return ans;
    }
}