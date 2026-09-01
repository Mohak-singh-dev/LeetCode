class Solution {
    public int mirrorDistance(int n) {
        int num = n,rev=0;
        while(num!=0){
            int digit = num%10;
            num/=10;
            rev= rev*10 + digit;
        }
        return Math.abs(n-rev);
    }
}