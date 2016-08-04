package test.sort;

/**
 * AlgorithmQuestions
 * @author lyt
 * @date Aug 4, 2016
 * @TODO 冒泡排序算法
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 12, 48, 2, 43, 66, 22 };
		bubbleSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

	public static void bubbleSort(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort1(int[] nums){
		int temp;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
	}
}
