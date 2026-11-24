class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        maxWater = 0

        while l < r:
            length = min(heights[l], heights[r])
            width = r - l
            curArea = length * width

            maxWater = max(maxWater, curArea)

            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
        return maxWater
        