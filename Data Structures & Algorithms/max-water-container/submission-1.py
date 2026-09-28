class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights)-1
        best = 0
        while l < r:
            top = 0
            if (heights[l] > heights[r]):
                top = heights[r]
            else:
                top = heights[l]
            
            volume = (r-l) * top

            if volume > best:
                best = volume
            
            if heights[l] <= heights[r]:
                l += 1
            else:
                r -= 1
        return best