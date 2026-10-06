class Solution {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            temp = Character.toLowerCase(temp);
            if(Character.isLetterOrDigit(temp)){
                list.add(temp);
            }
        }
        List<Character> revList = new ArrayList<>(list);
        Collections.reverse(revList);
        return list.equals(revList);
        
    }
}