# Getting Started

## DSA Problems Topic-wise Separated by Difficulty Level

### Easy

1. **Largest Element in an Array**
   ### Bruteforce Approach
   - **Method**:Using Sort method
   - **Time complexity**: O(N log N)
   - **Space complexity**: O(1)
   - **Optimized Approach**:
     - **Method**: By initializing the first value of the array as high and comparing each element in the array with high
     - **Time complexity**: O(N)
     - **Space complexity**: O(1)

2. **Second Largest Element in an Array**
   #### Bruteforce Approach
   - **Method**: Using Sort method
   - **Time Complexity**: O(N logN + N (in case all values are the same))
   - **Space Complexity**: O(1)

   #### Better Approach
   - **Method**: Finding largest and second largest in two passes
   - **Time Complexity**: O(2N)
   - **Space Complexity**: O(1)

   #### Optimized Approach
   - **Method**: Finding largest and second largest in one pass
   - **Time Complexity**: O(N)
   - **Space Complexity**: O(1)
