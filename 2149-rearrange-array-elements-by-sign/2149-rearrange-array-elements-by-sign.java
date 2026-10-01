class Solution {
    public int[] rearrangeArray(int[] nums) {
        List <Integer> pos = new ArrayList<>();
        List <Integer> neg = new ArrayList<>();
        List <Integer> result = new ArrayList<>();
        
        for(int value : nums){
            if(value < 0)   neg.add(value);
            else pos.add(value);
        }

        for(int i=0; i<pos.size(); i++){
            result.add(pos.get(i));
            result.add(neg.get(i));
        }

        int []ans = new int[result.size()];
        for(int i=0; i< result.size();i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}