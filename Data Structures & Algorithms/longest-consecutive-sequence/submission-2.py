class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hash = {}

        for n in nums:
            if n in hash:
                continue

            left = hash.get(n - 1, 0)
            right = hash.get(n + 1, 0)
            total = left + right + 1

            hash[n] = total
            hash[n - left] = total
            hash[n + right] = total
        
        res = 0;
        for num, count in hash.items():
            if count > res:
                res = count
        
        return res
