# Array -----------------
nums = [0, 10, 20, 30, 40, 50]
for i, num in enumerate(nums):
    print(i, num)

# Linked List -----------
class LinkedListNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next