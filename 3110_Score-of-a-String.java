class Solution {
    public int scoreOfString(String s) {
        int prev = (int) s.charAt(0);
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            int assci = (int) s.charAt(i);
            sum += Math.abs(prev - assci);
            prev = assci;
        }
        return sum;
    }
}
