class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles,n = numBottles;
        while (n/numExchange > 0){
            int temp = n%numExchange;
            n = n /numExchange;
            res+=n;
            n+=temp;
        }
        return res;
    }
}