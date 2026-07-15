class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length-1;

        for(int i = 0; i < heights.length; i++)
        {
            while(l < r)
            {
                if((r - l) * Math.min(heights[l], heights[r]) > res)
                {
                    res = (r - l) * Math.min(heights[l], heights[r]);
                }
                r--;
            }
            l++;
            r = heights.length-1;
        }
        return res;
    }
}
