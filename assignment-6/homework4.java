class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==0){
        return 0;
    }
        int maxLen=0;
        int presum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                presum-=1;
            }else if(nums[i]==1){
                presum+=+1;
            }
            
            if(map.containsKey(presum)){
                int idx=map.get(presum);
                int currLen=i-idx;
                maxLen = Math.max(maxLen,currLen);
            }
            else{
                map.put(presum,i);
            }
        }
       return maxLen; 
    }
}