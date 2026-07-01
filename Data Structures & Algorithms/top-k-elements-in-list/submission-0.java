class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        ArrayList<Integer>[] freq = new ArrayList[nums.length + 1];
        for(int i = 0; i<freq.length; i++)
        {
            freq[i] = new ArrayList<>();
        }

        for(int num : nums)
        {
            counter.put(num, counter.getOrDefault(num,0)+1);
        }

        for(HashMap.Entry<Integer, Integer> entry: counter.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i >= 0 && index < k; i--) 
        {
            for (int num : freq[i]) 
            {
                result[index] = num;
                index++;
                if (index == k) break;
            }
        }
        return result;
        
    }
}
