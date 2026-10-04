class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long curr = 1;
        result.add(1);

        for(int col=1; col <= rowIndex; col++){
            curr = curr* (rowIndex -col +1)/col;
            result.add((int)curr);
        }
        return result;
    }
}