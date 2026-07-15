class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            hash.add(nums[i]);
        }
        int count = 0;
        for (int num : hash)
        {
            if(!hash.contains(num-1))
            {
                int temp = 1;
                while(hash.contains(num+temp))
                {
                    temp++;
                }
                
                if(temp > count)
                {
                    count = temp;
                }
            }
        }
        return count;
    }
}
