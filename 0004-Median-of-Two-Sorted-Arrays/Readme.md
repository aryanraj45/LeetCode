# 📊 LeetCode 004 — Median of Two Sorted Arrays

### 🏷️ Problem Statement
Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be **O(log (m + n))**.

---

### 💡 Example 1
**Input:**
nums1 = [1,3]
nums2 = [2]



**Output:**
2.00000

yaml
Copy code

**Explanation:**
merged array = [1,2,3] and median is 2.

---

### 💡 Example 2
**Input:**
nums1 = [1,2]
nums2 = [3,4]

makefile
Copy code

**Output:**
2.50000

yaml
Copy code

**Explanation:**
merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

---

### 💡 Example 3
**Input:**
nums1 = [0,0]
nums2 = [0,0]

makefile
Copy code

**Output:**
0.00000

yaml
Copy code

---

### 💡 Example 4
**Input:**
nums1 = []
nums2 = [1]

makefile
Copy code

**Output:**
1.00000

yaml
Copy code

---

### 💡 Example 5
**Input:**
nums1 = [2]
nums2 = []

makefile
Copy code

**Output:**
2.00000

yaml
Copy code

---

### ⚙️ Constraints
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6

yaml
Copy code

---

### 💻 Solution (Java)
class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int m = nums1.length;
int n = nums2.length;
int[] merged = new int[m + n];
int i = 0, j = 0, k = 0;

kotlin
Copy code
    // Merge two sorted arrays
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            merged[k++] = nums1[i++];
        } else {
            merged[k++] = nums2[j++];
        }
    }
    while (i < m) merged[k++] = nums1[i++];
    while (j < n) merged[k++] = nums2[j++];

    int total = m + n;
    if (total % 2 == 1) {
        return merged[total / 2];
    } else {
        return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
    }
}
}

yaml
Copy code

---

### 🕒 Complexity Analysis
Time Complexity: O(m + n)
Space Complexity: O(m + n)

yaml
Copy code

---

### ⚡ Optimized Approach (Binary Search - O(log(min(m, n))))
This version uses binary search on the smaller array to partition both arrays efficiently.

class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
if (nums1.length > nums2.length) {
return findMedianSortedArrays(nums2, nums1);
}

pgsql
Copy code
    int m = nums1.length, n = nums2.length;
    int low = 0, high = m;

    while (low <= high) {
        int partitionX = (low + high) / 2;
        int partitionY = (m + n + 1) / 2 - partitionX;

        int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
        int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
        int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
        int minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

        if (maxX <= minY && maxY <= minX) {
            if ((m + n) % 2 == 0) {
                return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
            } else {
                return Math.max(maxX, maxY);
            }
        } else if (maxX > minY) {
            high = partitionX - 1;
        } else {
            low = partitionX + 1;
        }
    }
    throw new IllegalArgumentException();
}
}




---

### 🧠 Complexity (Optimized)
Time Complexity: O(log(min(m, n)))
Space Complexity: O(1)

e

---

### 📁 Folder Structure
Median of Two Sorted Arrays/
│
├── README.md
└── Solution.java



---

### 🔗 LeetCode Link
[https://leetcode.com/problems/median-of-two-sorted-arrays/](https://leetcode.com/proble
