class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.merge(n,1,(oldValue,newValue)-> oldValue + 1);
        }
        int max = Collections.max(map.values());
        for ( Map.Entry<Integer,Integer> e:map.entrySet()){
            if (e.getValue() == max){
                count+= e.getValue();
            }
        }
        return count;
        
    }
}