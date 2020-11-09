//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2737 👎 0


import java.util.Arrays;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0 ; i < nums.length-2 ; i++) {
            if (i == 0 || (i != 0 && nums[i] != nums[i-1])) {
                int low = i + 1,hig = nums.length -1 ,sum = 0 - nums[i];
                while (low < hig) {
                    if(nums[low] + nums[hig] == sum){
                        res.add(Arrays.asList(nums[i],nums[low],nums[hig]));
                        while (low < hig && nums[low] == nums[low + 1]) low++;
                        while (low < hig && nums[hig] == nums[hig - 1]) hig--;
                        hig--;low++;
                    } else if (nums[low] + nums[hig] < sum) {
                        low++;
                    } else {
                        hig--;
                    }
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
