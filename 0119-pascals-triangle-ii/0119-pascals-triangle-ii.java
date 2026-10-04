class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List <Integer>> triangle = new ArrayList<>();
        for(int row=0; row <= rowIndex;row++){
            List<Integer> curr = new ArrayList<>();
            for(int col=0; col<= row; col++){
                curr.add(1);
            }
            for(int col=1; col<row; col++){
                int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                curr.set(col , value);
            }
            triangle.add(curr);
        }
        return triangle.get(rowIndex);
    }
}