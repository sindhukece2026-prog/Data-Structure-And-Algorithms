class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> h = new HashMap<>();
        int i = 0;
         for(int x :nums){
            if(h.containsKey(target-x)){
                ans[0]= h.get(target-x);
                ans[1]=i;
            }
            else{
                h.put(x,i);
            }
            i++;
         }
         return ans;










    //  int[] ans=new int[2];
    //  HashMap<Integer, Integer> h=new HashMap<>();
    //  int i=0;
    //  for(int x:nums){
    //     if(h.containsKey(target-x)){
    //         ans[0]= h.get(target-x);
    //         ans[1]=i;
    //     }
    //     else{
    //         h.put(x,i);
    //     }
    //     i++;
    //  }
    //    return ans;
        
     }
}