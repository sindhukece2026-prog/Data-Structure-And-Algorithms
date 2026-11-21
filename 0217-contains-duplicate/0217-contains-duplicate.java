class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int x : nums){
            if(h.containsKey(x)){
                return true;
            }
            else{
                h.put(x, 1);
            }
        }
    return false;








        // HashSet h = new HashSet();
        // for( int i:nums){
        //     h.add(i);
        // }
        // if(nums.length!= h.size()){
        //     return true;
        // }
        // return false;
        }    
}