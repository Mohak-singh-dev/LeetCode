class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,result=0;
        for (int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if (letter == '(') open++;
            else{
                if (open>0) open--;
                else result++;
            }

        }
        return result+open;
    }
}