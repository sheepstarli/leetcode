package com.lcx.leetcode.twosum;

/**
 * @author lcx
 * @date 2016年5月26日 上午11:44:23
 */
public class TwoSumSolution {

	public static void main(String[] args) {
		printSum(new int[] {1,2,4,8,19}, 20);
		printSum(new int[] {1,2,4,8,19}, 6);
		printSum(new int[] {1,2,4,8,19}, 12);
		printSum(new int[] {1,2,4,8,19}, 27);
		printSum(new int[] {1,2,4,8,19}, 7);
	}
	
	public static void printSum(int[] nums, int target) {
		System.out.print("Input nums is: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Expceted num is:" + target);
		int[] resultArr = twoSum(nums, target);
		System.out.println("Result is: " + resultArr[0] + " " + resultArr[1]);
		System.out.println();
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int x = -1;
		int y = -1;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int remain = target - temp;
			for (int t = i + 1; t < nums.length; t++) {
				if (remain < nums[t]) {
					break;
				}
				if (remain == nums[t]) {
					x = i;
					y = t;
				}
			}
		}
		return new int[] {x,y};
	}

}
