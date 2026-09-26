class Solution {
    private void backTrack(int open, int close, int n , StringBuilder stack , List<String> res){
        if(open == close && open == n){
            res.add(stack.toString());
            return;
        }
        if(open < n){
            stack.append('(');
            backTrack(open+1 , close, n , stack, res);
            stack.deleteCharAt(stack.length()-1);
        }
        if(close < open){
            stack.append(')');
            backTrack(open, close+1, n , stack, res);
            stack.deleteCharAt(stack.length() -1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();

        backTrack(0,0,n,stack,res);
        return res;
    }
}