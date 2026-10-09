class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int ele:nums){
            map.merge(ele,1,(o,n)->o+1);
        }
        map.forEach((key,value) -> {
            if (value==2){
                result.add(key);
            }
        });
        int[] f1 = new int[2];
        f1[0] = result.get(0);
        f1[1] = result.get(1);
        return f1;
    }
}