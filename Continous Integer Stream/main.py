# You are given a continuous stream of integers, where each integer arrives one at a time. Your task is to design an efficient algorithm that:
# 
#     Maintains only the last k integers in memory.
#     At any moment, finds and outputs the smallest absolute difference between any two numbers among the last k integers.
class StreamProcessor:
    def __init__(self, k: int):
        self.k = k
        self.lis = []  # Manually maintained sorted list
    
    def add(self, num: int) -> int:
        # Remove oldest element if we already have k elements
        if len(self.lis) == self.k:
            self.lis.pop(0)  

        # Insert in sorted order (Binary Insertion for O(k) performance)
        index = 0
        while index < len(self.lis) and self.lis[index] < num:
            index += 1
        self.lis.insert(index, num)  # Insert in the correct position
        
        # If less than 2 elements, return -1 since no pair exists
        if len(self.lis) < 2:
            return -1 
        
        # Find the minimum difference between adjacent elements
        min_diff = float('inf')
        for i in range(len(self.lis) - 1):
            min_diff = min(min_diff, self.lis[i+1] - self.lis[i])
        
        return min_diff


if __name__ == "__main__":
    processor = StreamProcessor(3)  # Maintain last 3 numbers
    print(processor.add(10))  # No pair exists yet, return some default (e.g., inf or -1)
    print(processor.add(3))   # No pair exists yet, return inf
    print(processor.add(20))  # Smallest diff pair: (10, 3) -> Output 7
    print(processor.add(15))  # Last 3 numbers: [3, 20, 15], smallest diff is (15, 20) -> Output 5