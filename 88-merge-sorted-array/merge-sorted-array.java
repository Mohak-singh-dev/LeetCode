class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m>0 && n>0)
        {
            int i=0,j=0,k=0;
            int[] temp = new int[m];
            for(int x = 0;x<m;x++){
                temp[x] = nums1[x];
            }
            while(i<m && j<n){
                if (temp[i]<nums2[j]){
                    nums1[k] = temp[i];
                    i++;
                }else{
                    nums1[k] = nums2[j];
                    j++;
                }
                k++;
            }
            while (i<m){
                nums1[k] = temp[i];
                i++;
                k++;
            }
            while (j<n){
                nums1[k] = nums2[j];
                j++;
                k++;
            }   
        }
        else if (m==0){
            for (int i =0;i<n;i++){
                nums1[i] = nums2[i];
            }
        }
    }
}