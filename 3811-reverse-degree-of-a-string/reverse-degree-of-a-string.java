class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for (int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            int indexInRev = ((letter - 96) * -1) + 27;
            result += (indexInRev * (i+1));
        }
        return result;
    }
}