class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if (len(s2) < len(s1)):
            return False
        count1 = {}
        for letter in s1:
            count1[letter] = 1 + count1.get(letter, 0)
        
        r = 0
        while(r <= len(s2)-len(s1)):
            count2 = {}
            i = r
            while (i != r+len(s1)):
                count2[s2[i]] = 1 + count2.get(s2[i], 0)
                i += 1
            if(count2 == count1):
                return True
            else: 
                r += 1

        return False