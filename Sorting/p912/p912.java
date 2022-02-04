class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    public void mergeSort(int[] arr, int left, int right) {
        
        if (left >= right) {
            return;
        }
        
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, right);
    }
    
    public void merge(int arr[], int left, int right) {
        int[] merged = new int[right - left + 1];
        int mid = (left + right) / 2;
        int arrLength = merged.length;
        int i = left, j = mid + 1;
        
        for (int index = 0; index < arrLength; index++) {
            if (i == mid + 1) {
                merged[index] = arr[j];
                j++;
            } else if (j == right + 1) {
                merged[index] = arr[i];
                i++;
            } else {
                if (arr[i] > arr[j]) {
                    merged[index] = arr[j];
                    j++;
                } else {
                    merged[index] = arr[i];
                    i++;
                }
            }
        }
        
        for (int index = 0; index < merged.length; index++) {
            arr[left + index] = merged[index];
        }
        
    }
}
