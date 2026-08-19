class Solution {

    public int firstOccurrence(int[] a, int low, int high, int key) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                ans = mid;
                high = mid - 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int lastOccurrence(int[] a, int low, int high, int key) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                ans = mid;
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        return new int[]{
            firstOccurrence(nums, low, high, target),
            lastOccurrence(nums, low, high, target)
        };
    }
}