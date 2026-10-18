class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (char i: n.toCharArray()){
            int num = (int) i -'0';
            max = Math.max(max,num);
        }
        return max;
    }
}