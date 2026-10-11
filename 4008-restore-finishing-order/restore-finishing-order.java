class Solution {
    private boolean contains(int n,int[] friends){
        return Arrays.stream(friends).anyMatch(i -> i==n);
    }
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int j=0;
        for (int i: order){
            if(contains(i,friends)){
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}