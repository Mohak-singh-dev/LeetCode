class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1,num=n;
        while (num!=0){
            int digit = num%10;
            sum+=digit;
            pro*=digit;
            num/=10;
        }
        if (n%(sum+pro)==0){
            return true;
        }
        return false;
    }
}