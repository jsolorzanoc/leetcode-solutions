import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> notebook = new HashMap<>();

        for (var i = 0; i < nums.length; i++){
            int num = nums[i];
            if (notebook.containsKey(target - num)){
                return new int[]{i, notebook.get(target-num)};
            }
            notebook.put(num,i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result1 = solution.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println("[" + result1[0] + "," + result1[1]+"]");

    }



}
