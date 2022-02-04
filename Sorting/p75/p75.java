class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int i = 0 ;i < nums.length; i++) {
            colors[nums[i]]++;
        }
        int index = 0;
        while (colors[0] > 0) {
            nums[index] = 0;
            colors[0]--;
            index++;
        }
        while (colors[1] > 0) {
            nums[index] = 1;
            colors[1]--;
            index++;
        }
        while (colors[2] > 0) {
            nums[index] = 2;
            colors[2]--;
            index++;
        }
    }
}
