class Solution {
    private int GCD(int a,int b){
        while (b!=0){
            int remainder = a%b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumE=0;
        int sumO=0;
        for (int i=1;i<=n*2;i++){
            if (i%2==0) sumE++;
            else sumO++;
        }
        return GCD(sumE,sumO);
    }
}