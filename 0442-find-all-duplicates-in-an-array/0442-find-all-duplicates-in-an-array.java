class Solution {
    public List<Integer> findDuplicates(int[] nums) {

//         HashMap<Integer, Integer> h = new HashMap<>();
//         int count = 0;
//         for(int x : nums){
//             if(h.containsKey(x)){
//                 count = h.get(x);
//                 count++;
//                 h.put(x, count);
//             }
//             else{
//                 h.put(x, 1);
//             }
//         }

//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i :h.keySet()){
//             if(h.get(i)==2){
//                 ans.add(i);
//             }
//         }

// return ans;

//-------------------------------------------------------------------------------

        HashMap<Integer, Integer> h=new HashMap<>();
         ArrayList a=new ArrayList();
        for(int i:nums){
            if(h.containsKey(i)){
                a.add(i);
            }
            else{
                h.put(i,1);
            }
        }
       
       
        return a;
    }
}