class Solution {
    public int maxDistinct(String s) {
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,1);
        }
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if (e.getValue() == 1){
                count++;
            }
        }
        return count;
    }
}