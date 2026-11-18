class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        
        for num in nums:
            count[num] = count.get(num, 0) + 1
        
        buckets = []
        
    #create empty bucjkets
        for i in range(len(nums) + 1):
            buckets.append([])

        for key, value in count.items():
            buckets[value].append(key)

        res = []

        for i in range(len(buckets) - 1, 0, -1):
            for num in buckets[i]:
                res.append(num)

                if len(res) == k:
                    return res




        #grab k values
