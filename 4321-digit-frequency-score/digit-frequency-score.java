class Solution {
    public int digitFrequencyScore(int n) {
        int score=0,num=n;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(num!=0){
            int digit = num%10;
            map.merge(digit,1, (oldValue,newValue) -> oldValue+1);
            num/=10;
        }
        for (Map.Entry<Integer,Integer> e: map.entrySet()){
            score += e.getValue() * e.getKey();
        }
        return score;
    }
}