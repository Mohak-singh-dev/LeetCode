class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s: strs){
            int[] count = new int[26];
            for (int i=0;i<s.length();i++){
                int c = s.charAt(i);
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i: count){
                sb.append(i);
                sb.append("#");
            }
            String k = sb.toString();
            if (!map.containsKey(k)){
                map.put(k,new ArrayList<String>());
            }
            map.get(k).add(s);
        }
        for (List l1: map.values()){
            result.add(l1);
        }
        return result;
    }
}