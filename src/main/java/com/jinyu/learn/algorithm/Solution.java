package com.jinyu.learn.algorithm;

class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int k = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                ++k;
            }
        }
        for (int j = k; j <= l - 1; j++) {
            nums[j] = 0;
        }
    }
}
