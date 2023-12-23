package dsa;

import java.util.Arrays;

public class SortColors {
	
	public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while (mid <= high) {
            if (nums[mid] == 0){
                swap(nums, low, mid);
                mid++;
                low++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {2, 0, 2, 1, 1, 0};
		System.out.print("Array before Sorting: ");
		System.out.println(Arrays.toString(nums1));
        sortColors(nums1);
        System.out.print("Array after Sorting: ");
        System.out.println(Arrays.toString(nums1));
	}

}
