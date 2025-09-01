def max_subarray_sum(arr, low, high):
    # Base case: only one element
    if low == high:
        return arr[low]
    
    # Function to find max sum crossing the mid
    def max_crossing_sum(arr, low, mid, high):
        left_sum = float('-inf')
        s = 0
        for i in range(mid, low-1, -1):
            s += arr[i]
            left_sum = max(left_sum, s)
        
        right_sum = float('-inf')
        s = 0
        for i in range(mid+1, high+1):
            s += arr[i]
            right_sum = max(right_sum, s)
        
        return left_sum + right_sum
    
    mid = (low + high) // 2
    
    # Recursively find max in left and right halves
    left_max = max_subarray_sum(arr, low, mid)
    right_max = max_subarray_sum(arr, mid+1, high)
    cross_max = max_crossing_sum(arr, low, mid, high)
    
    # Return the maximum of three
    return max(left_max, right_max, cross_max)

# Example usage:
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
n = len(arr)
result = max_subarray_sum(arr, 0, n-1)
print("Maximum Subarray Sum is:", result)
