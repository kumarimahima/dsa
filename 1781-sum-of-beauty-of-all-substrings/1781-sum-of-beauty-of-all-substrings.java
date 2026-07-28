class Solution {
    static int beauty(int[] nums, int min)  {
        int max = 1;
        for (int i=0;i<126;i++) {
            if(nums[i]!=0) min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max-min;
    }

    public int beautySum(String s) {
        int nums[] = new int[126];
        int result = 0;
        int size = s.length();
        for (int i=0;i<size;i++) {
            for (int j=i;j<size;j++){
                nums[s.charAt(j)]++;
                int beautyValue = beauty(nums, size);
                result += beautyValue;
            }
            Arrays.fill(nums, 0);
        }
        return result;
    }
}