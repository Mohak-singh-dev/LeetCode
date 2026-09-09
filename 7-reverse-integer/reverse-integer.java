class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        long result =0;
        while(num!=0){
            int digit = num%10;
            result = result*10 + digit;
            num/=10;
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }
        if (x<0){
            return (int)result*-1;
        }else{
            return (int)result;
        }
    }
}