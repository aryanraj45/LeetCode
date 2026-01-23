# 0026 — Remove Duplicates from Sorted Array

**Difficulty:** Easy

---

## Problem

Given an integer array `nums` **sorted in non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only once.  
The **relative order** of the elements should be kept the same.

Return the number of unique elements in `nums`.

> Since it is impossible to change the length of the array in some languages,  
> you must place the result in the first part of the array `nums`.  
> More formally, if there are `k` elements after removing duplicates,  
> then the first `k` elements of `nums` should hold the final result.  
> It does not matter what you leave beyond the first `k` elements.

---

## Example

**Example 1:**  
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are represented as underscores).

markdown
Copy code

**Example 2:**  
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,,,,,_]

yaml
Copy code

---

## Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is **sorted** in non-decreasing order.

---

## Approach (No Solution Included)

### 1. Two-Pointer Technique
- Use one pointer (`i`) to track the position of the last unique element.
- Use another pointer (`j`) to iterate through the array.
- When a new unique number is found (`nums[j] != nums[i]`), increment `i` and copy the new value into `nums[i]`.

### 2. Key Observations
- Since the array is sorted, duplicates will always appear **next to each other**.
- In-place update ensures **O(1)** extra space usage.

---

## Complexity

- **Time Complexity:** `O(n)` — Each element is processed once.
- **Space Complexity:** `O(1)` — Constant space since operations are in-place.

---

## Edge Cases

- Array with only one element → `[1]`
- Array with all duplicates → `[2,2,2,2]`
- Array with all unique values → `[1,2,3,4]`
- Large array (performance check)

---

## Notes

- Make sure the final returned `k` correctly represents the count of unique elements.
- Do not create another array; modify the input in-place.
- Elements beyond index `k-1` can be ignored after processing.
<!-- Updated for commit sequence -->
