# Getting Started

## DSA Problems Topic-wise Separated by Difficulty Level

### Easy

1. **Largest Element in an Array**

   #### Bruteforce Approach
   - **Method**: Using Sort method
   - **Time complexity**: O(N log N)
   - **Space complexity**: O(1)

   #### Optimized Approach
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

3. **Left Rotate the Array by One Place**

   #### Approach
   - **Method**: Shift each element of the array to the left by one position and rotate the first element to the end.
   - **Time Complexity**: O(N)
   - **Space Complexity**: O(1)

4. **Left Rotate the Array by D Places**

   #### Bruteforce Approach
   - **Method**: Create a temporary array to store the first 'D' elements.Shift the remaining elements to the left.Place the elements from the temporary array at the end of the main array.
   - **Time Complexity**: O(D)+O(N-D)+O(D) -> O(N+D) ->O(N)
   - **Space Complexity**: O(D)
  
   #### Optimized Approach
   - **Method**: Reverse the first 'D' elements.Reverse the remaining 'N-D' elements.Reverse the entire array.
   - **Time Complexity**: O(N)
   - **Space Complexity**: O(1)


5. **Move All Zeros to the End of the Array**

   #### Bruteforce Approach
   - **Method: Create a temporary list to store non-zero elements.Iterate through the array to populate the temporary list with non-zero elements.Fill the remaining positions in the array with zeros.
   - **Time Complexity**: O(N)
   - **Space Complexity**: O(N)

   #### Optimized Approach
   - **Method: Use a pointer (`nzIndex`) to track the next non-zero element's index.Iterate through the array and move non-zero elements to the front using `nzIndex`.Fill the remaining positions in the array with zeros.
   - **Time Complexity**: O(N)
   - **Space Complexity**: O(1)

6. **Union of Sorted Arrays**

   #### Approach
   - **Method: Use a `TreeSet` to store elements from both arrays, ensuring all elements are unique and sorted automatically.Iterate through both arrays to add elements to the `TreeSet`.Convert the `TreeSet` back to an array to get the union of the two sorted arrays.
   - **Time Complexity**: O(N log N) (due to TreeSet operations)
   - **Space Complexity**: O(N)
  
7.  **Find Missing Number in Array**

    #### Bruteforce Approach
    - **Method: Iterate through numbers from 1 to N.For each number, check if it exists in the array.Return the number if not found.
    - **Time Complexity**: O(N^2)
    - **Space Complexity**: O(1)

    #### Optimized Approach
    - **Method: Calculate the expected sum of numbers from 1 to N using the formula \( \text{expectedSum} = \frac{N \times (N + 1)}{2} \).Calculate the actual sum of elements in the array.The missing number is \( \text{expectedSum} - \text{actualSum} \).
    - **Time Complexity**: O(N)
    - **Space Complexity**: O(1)

   
