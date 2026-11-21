class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        int sum = 0;
        h.put(0, 1);
        for(int x:nums){
            sum = sum +x;
            if(h.containsKey(sum-k)){
                count = count+ h.get(sum-k);
            }
        
                h.put(sum,h.getOrDefault(sum, 0) + 1);
            
        }
    return count;









    //     HashMap<Integer, Integer> h = new HashMap<>();
    //     int count = 0;
    //     for(int x:nums){
    //         if(h.containsKey(k-x)){
    //             count = h.get(k-x);
    //             count++;
    //             h.put(x,count);
    //         }
    //         else{
    //             h.put(x,1);
    //         }
    //     }
    // return count;






    //     int count=0;
    //     for(int i =0; i<=nums.length-1; i++){
    //         for( int j = i+1; j <=nums.length-1;j++){
    //             if(nums[i]+nums[j]==k){
    //                 count++;
    //         }
    //         if(nums[i]==k){
    //             count++;
    //         }
    //         }
    //     }
    // return count;
        
    }
}