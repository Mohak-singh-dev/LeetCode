class Solution {
    public static int bin(int[] a,int low,int high,int key){
		int mid = 1;
		while (low<=high){
			mid = low +(high - low)/2;
			
			if (a[mid]==key){				
				return mid;
			}
			else if (key<a[mid]){
				high = mid -1;
			}
			else{
				low = mid +1;
			}
		}
        return -1;
	}
    public int search(int[] nums, int target) {
        return bin(nums,0,nums.length-1,target);
    }
}