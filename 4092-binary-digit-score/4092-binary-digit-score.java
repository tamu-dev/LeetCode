class Solution {
    public int calculateScore(int a, int b) {
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);

        int cntOne = 0;
        int cntTwo = 0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1') cntOne++;
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='1') cntTwo++;
        }

        if(cntOne >= cntTwo) return cntOne * cntTwo;
        else return cntTwo / cntOne;
    }
}