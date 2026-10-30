class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // List<Integer> list = new ArrayList<>();
        // int i=0;
        // for (String s: words){
        //     for(char c: s.toCharArray()){
        //         if (c==x) {
        //             list.add(i);
        //             break;
        //         }
        //     }
        //     i++;
        // }
        // return list;
        List<Integer> list = new ArrayList<>();
        int i=0;
        for (String s: words){
            if (s.indexOf(x)!=-1){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}