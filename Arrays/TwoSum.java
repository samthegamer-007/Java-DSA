//NeetCode 2
//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//Return the answer with the smaller index first.
//SOLUTION
class Solution {
    public int[] twoSum(int[] nums, int target) {
       for (int i= 0; i<nums.length;i++)
       {
        for (int j= 0;j<nums.length;j++)
        {
            if (i==j)
            continue;
            if ((nums[i]+nums[j])==target)
            return  new int[]{i,j};
        }
       } 
       return new int[0];
    }
}
