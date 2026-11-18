class Solution {
    public long countValidSubstrings(String s) {
        long n = s.length();
        long total = (long) n*(n+1)/2;
        long invalid = 0;
        int last = -1;

        for(int i=0;i<n-2;i++){
            if(s.charAt(i) == 'a'&&
                s.charAt(i+1) == 'b'&&
                s.charAt(i+2) == 'c'){
                    last = i;
                }
            invalid += last +1; 
        }
        return total - invalid;
    }
}