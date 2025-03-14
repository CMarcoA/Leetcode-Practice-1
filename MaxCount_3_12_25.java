//* 2529. Maximum Count of Positive Integer and Negative Integer
// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
// In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.

class MySolution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] < 0){
                neg++;
            }
            if(nums[i] > 0){
                pos++;
            }
        }
        return Math.max(pos,neg);
    }
}

// =========================================== //

// Approach (1) O(n)
// Iterate through the list to count the number of negative elements (neg).
// Identify the first positive number, and compute its count (pos = total length - index of first positive).
// Compare neg and pos, and return the maximum value.
// Complexity Analysis
// Time Complexity: (O(n)) (Iterate once through nums).
// Space Complexity: (O(1)) (Only a few extra variables).

class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            else if (neg == 0 && nums[i] > 0) return n - i;
            else if (nums[i] < 0) neg++;
            else if (nums[i] > 0) return Math.max(neg, n - i);
        }

        return Math.max(neg, 0);
    }
}