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
