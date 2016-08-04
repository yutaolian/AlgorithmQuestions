package test.sort;

/**
 * 快速排序
 * @author lyt
 * @date Aug 4, 2016
 * @TODO
 */

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arrays = {123,34,11,56,89,43,22};
		
		quickSort(arrays, 0, arrays.length-1);
		
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i]+",");
		}
	}
	
	public static void quickSort(int[] arrays,int left, int right) {
		if (left < right) {
			int flag = partition(arrays, left, right);
			//递归基准值之前的数据
			quickSort(arrays, left, flag - 1);
			//排基准值之后的数据
			quickSort(arrays, flag + 1, right);
		}
	}
	
	static int partition(int[] arrays, int left ,int right){
		//选取一个基准（一般选择第0个）
		int base = arrays[left];
		while (left < right) {
			while (left < right && arrays[right] >= base) {
				right --;
			}
			arrays[left] = arrays[right];
			while (left < right && arrays[left] <= base) {
				left ++;
			}
			arrays[right] = arrays[left];
		}
		arrays[left] = base;
		return left;
	}

}
