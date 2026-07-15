class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while(r > l)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0)
                {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
                else if(sum > 0)
                {
                    r--;
                }
                else if (sum < 0)
                {
                    l++;
                }

            }

        }

        return res;
    }
}
