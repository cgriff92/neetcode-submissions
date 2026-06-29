class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i < nums.length; i++)
        {
            if(i == 0)
            {
                map.put(nums[i], i);
            }
            else{
                int solve = target - nums[i];
                if(map.containsKey(solve))
                {
                    int solution = map.get(solve);
                    int[] sAr= {solution, i};
                    return sAr;
                }
                else{
                    map.put(nums[i], i);
                }
            }
        }
        return null;
    }
}
