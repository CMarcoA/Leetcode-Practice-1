public class ShuffleArray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            n = (nums.length)/2;
            int[] newArr = new int[2*n];
            for(int i =0 ; i < n; i++){
                newArr[2 * i] = nums[i];
                newArr[2 * i +1] = nums[n + i];
            }
            return newArr;
        }
    }
}
