class Solution {
    public int digitFrequencyScore(int n) {
        int score=0,num=n;
        while(num!=0){
            int digit = num%10;
            score+=digit;
            num/=10;
        }
        return score;
    }
}