# 🔍 LeetCode 005 — Longest Palindromic Substring

### 🏷️ Problem Statement
Given a string `s`, return the **longest palindromic substring** in `s`.

A **palindrome** is a string that reads the same forward and backward (e.g., "aba", "bb").

---

### 💡 Example 1
**Input:**
s = "babad"

makefile
Copy code

**Output:**
"bab"

yaml
Copy code

**Note:** `"aba"` is also a valid answer.

---

### 💡 Example 2
**Input:**
s = "cbbd"

makefile
Copy code

**Output:**
"bb"

yaml
Copy code

---

### 💡 Example 3
**Input:**
s = "a"

makefile
Copy code

**Output:**
"a"

yaml
Copy code

---

### 💡 Example 4
**Input:**
s = "ac"

makefile
Copy code

**Output:**
"a"

yaml
Copy code

---

### ⚙️ Constraints
1 <= s.length <= 1000
s consists of only digits and English letters.

yaml
Copy code

---

## 💻 Solutions (Java)

### 1) Expand Around Center (recommended — simple & fast in practice)
class Solution {
public String longestPalindrome(String s) {
if (s == null || s.length() < 1) return "";
int start = 0, end = 0;
for (int i = 0; i < s.length(); i++) {
int len1 = expandFromCenter(s, i, i); // odd length
int len2 = expandFromCenter(s, i, i + 1); // even length
int len = Math.max(len1, len2);
if (len > end - start + 1) {
start = i - (len - 1) / 2;
end = i + len / 2;
}
}
return s.substring(start, end + 1);
}

arduino
Copy code
private int expandFromCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    return right - left - 1; // length of palindrome
}
}

makefile
Copy code

**Complexity:**  
Time: O(n^2) (center expansion from each index)
Space: O(1)

yaml
Copy code

---

### 2) Dynamic Programming (clear, uses table)
class Solution {
public String longestPalindrome(String s) {
int n = s.length();
if (n < 2) return s;
boolean[][] dp = new boolean[n][n];
int start = 0, maxLen = 1;

go
Copy code
    // substrings of length 1
    for (int i = 0; i < n; i++) dp[i][i] = true;

    // consider lengths from 2 to n
    for (int len = 2; len <= n; len++) {
        for (int i = 0; i + len - 1 < n; i++) {
            int j = i + len - 1;
            if (s.charAt(i) == s.charAt(j)) {
                if (len == 2 || dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }
    }
    return s.substring(start, start + maxLen);
}
}

makefile
Copy code

**Complexity:**  
Time: O(n^2)
Space: O(n^2)

yaml
Copy code

---

### 3) Manacher's Algorithm (optimal O(n))
class Solution {
public String longestPalindrome(String s) {
if (s == null || s.length() == 0) return "";
// Transform s to add separators ('#') to handle even-length palindromes
StringBuilder sb = new StringBuilder();
sb.append('^'); // starting sentinel
for (int i = 0; i < s.length(); i++) {
sb.append('#');
sb.append(s.charAt(i));
}
sb.append("#$"); // ending sentinel
char[] T = sb.toString().toCharArray();

pgsql
Copy code
    int n = T.length;
    int[] P = new int[n];
    int center = 0, right = 0;

    for (int i = 1; i < n - 1; i++) {
        int mirror = 2 * center - i;
        if (i < right) {
            P[i] = Math.min(right - i, P[mirror]);
        } else {
            P[i] = 0;
        }

        // expand around i
        while (T[i + 1 + P[i]] == T[i - 1 - P[i]]) {
            P[i]++;
        }

        // update center and right
        if (i + P[i] > right) {
            center = i;
            right = i + P[i];
        }
    }

    // find max palindrome length
    int maxLen = 0;
    int centerIndex = 0;
    for (int i = 1; i < n - 1; i++) {
        if (P[i] > maxLen) {
            maxLen = P[i];
            centerIndex = i;
        }
    }

    int start = (centerIndex - maxLen) / 2; // map back to original string indices
    return s.substring(start, start + maxLen);
}
}

makefile
Copy code

**Complexity:**  
Time: O(n)
Space: O(n)

yaml
Copy code

---

## 🧠 Notes & Tips
- For practical use and competitive programming, **expand around center** is simple and fast enough for `n <= 1000`.
- Use **Manacher** if you require guaranteed linear time for very large inputs.
- Dynamic programming is intuitive but uses O(n²) memory; useful for learning and understanding the palindrome-subproblem structure.

---

## 📁 Folder Structure
Longest Palindromic Substring/
│
├── README.md
├── SolutionExpandCenter.java
├── SolutionDP.java
└── SolutionManacher.java

yaml
Copy code

---

## 🔗 LeetCode Link
[https://leetcode.com/problems/longest-palindromic-substring/](https://leetcode.com/probl
