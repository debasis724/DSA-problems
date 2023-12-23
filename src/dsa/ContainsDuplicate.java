package dsa;

import java.util.HashMap;

public class ContainsDuplicate {
	/*
	public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i=0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
	*/
	
	public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> dup = new HashMap<>();
        for (int num:nums){
            if(dup.containsKey(num) && dup.get(num)>=1){
                return true;
            }
            dup.put(num,dup.getOrDefault(num,0)+1);
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));

	}

}
