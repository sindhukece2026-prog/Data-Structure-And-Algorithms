class Solution {
    public int maxSubArray(int[] nums) { 
    int sum = 0;
      int psum = nums[0];
        for(int x : nums){
            sum = Math.max(sum  + x, x);
            psum = Math.max(psum, sum);

        }
        return psum;











//----------------------------------------------------

//         int max=0;
//         int submax=nums[0];
//             for(int i:nums){
//             max=Math.max(max+i, i);
//             submax=Math.max(submax, max);
//         }
// return submax;
                
    }
}