# 🔢 LeetCode 008 — String to Integer (atoi)

### 🏷️ Problem Statement
Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer (similar to the C/C++ `atoi` function).

The algorithm for `myAtoi(string s)` is as follows:

1. **Read and ignore** any leading whitespace.  
2. **Check the sign** of the number (`+` or `-`).  
3. **Read digits** until a non-digit character is encountered or the end of the string is reached.  
4. **Convert** the digits into an integer.  
5. If the integer is out of the 32-bit signed integer range `[-2³¹, 2³¹ − 1]`, clamp it to the range.  
6. **Return** the final integer value.

---

### 💡 Example 1
**Input:**
s = "42"


**Output:**


42


**Explanation:**
The string represents a positive integer.

---

### 💡 Example 2
**Input:**


s = " -42"


**Output:**


-42


**Explanation:**
The first non-whitespace character is `-`, indicating a negative number.  
The substring `"-42"` is converted to `-42`.

---

### 💡 Example 3
**Input:**


s = "4193 with words"


**Output:**


4193


**Explanation:**
Conversion stops at the first non-digit character (`' '`).

---

### 💡 Example 4
**Input:**


s = "words and 987"


**Output:**


0


**Explanation:**
The first non-whitespace character is not a valid sign or digit, so no conversion is performed.

---

### 💡 Example 5
**Input:**


s = "-91283472332"


**Output:**


-2147483648


**Explanation:**
The value `-91283472332` is less than `INT_MIN` (`-2³¹`), so it is clamped to `-2147483648`.

---

### ⚙️ Constraints


0 <= s.length <= 200
s consists of English letters (lowercase and uppercase), digits (0-9), ' ', '+', '-', and '.'.


---

### 📁 Folder Structure


String to Integer (atoi)/
│
└── README.md


---

### 🔗 LeetCode Link
[https://leetcode.com/problems/string-to-integer-atoi/](https://leetcode.com/problems/string-to-integer-atoi/)
