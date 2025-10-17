# 0014 — Longest Common Prefix

**Difficulty:** Easy

---

## Problem

Write a function to find the **longest common prefix** string among an array of strings.  
If there is no common prefix, return an empty string `""`.

For example:
["flower", "flow", "flight"] → "fl"
["dog", "racecar", "car"] → ""

yaml
Copy code

---

## Examples

**Example 1**  
Input: strs = ["flower","flow","flight"]
Output: "fl"

markdown
Copy code

**Example 2**  
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: No common prefix among the input strings.

markdown
Copy code

**Example 3**  
Input: strs = ["a"]
Output: "a"

sql
Copy code

---

## Constraints

- `1 <= strs.length <= 200`  
- `0 <= strs[i].length <= 200`  
- `strs[i]` consists of only lowercase English letters (a–z).

---

## Approach (no full code solution)

Here are some guiding ideas and hints:

1. **Vertical scanning**  
   Compare characters column by column (first character of all strings, second character of all strings, etc.) until a mismatch is found.

2. **Horizontal scanning / pairwise prefix**  
   Maintain a prefix string; iteratively compare with each string and shrink it if mismatch occurs.

3. **Divide and conquer**  
   Split the array into halves, compute longest prefix in each half, then merge by finding common prefix of the two results.

4. **Binary search optimization**  
   Use binary search on the length of the prefix: check if all strings start with the first `mid` characters, and adjust search bounds.

5. **Edge cases**  
   - If the array is empty (though by constraints this may not happen)  
   - Strings of different lengths  
   - One string is empty → result is `""`  
   - All strings identical  

---

## Complexity

- **Time complexity:**  
  - Vertical / horizontal scanning: O(n * m) where n = number of strings, m = length of shortest string  
  - Binary search approach: O(n * m * log m) in worst case  
- **Space complexity:** O(1) (for iterative / scanning approaches)

---

## Test Cases / Corner Cases to Try

- `["flower","flow","flight"]` → `"fl"`  
- `["dog","racecar","car"]` → `""`  
- `["a"]` → `"a"`  
- `["", "abc"]` → `""`  
- `["aa","a"]` → `"a"`  
- All strings identical: `["test","test","test"]` → `"test"`  
- Very long common prefix then one difference at the end  

---

## Notes

- This README intentionally omits full code implementation.  
- Use this scaffold when writing solution or explaining in your code.  