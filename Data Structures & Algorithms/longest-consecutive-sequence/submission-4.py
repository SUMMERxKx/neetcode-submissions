class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longSet = set(nums)
        longest = 0
        
        for num in longSet:
            if (num - 1) not in longSet:
                length = 1
                while (num + length) in longSet:
                    length += 1
                longest = max(longest, length)
        return longest
        