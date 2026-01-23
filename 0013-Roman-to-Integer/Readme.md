# 0013 — Roman to Integer

**Difficulty:** Easy

---

## Problem

Roman numerals are represented by seven different symbols:  
I, V, X, L, C, D, M

markdown
Copy code
They are usually written from largest to smallest from left to right. However, in some cases, the numeral for a smaller value appears before a larger value, which indicates subtraction. The six such instances are:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example:
- `2` is written as `II` in Roman numeral, which is two ones added.
- `12` is written as `XII`, which is `X + II`.
- `27` is written as `XXVII`, which is `XX + V + II`.

The subtraction rule is applied in six cases:
- `I` placed before `V` or `X` indicates one less, e.g. `IV = 4`, `IX = 9`.
- `X` placed before `L` or `C` indicates ten less, e.g. `XL = 40`, `XC = 90`.
- `C` placed before `D` or `M` indicates hundred less, e.g. `CD = 400`, `CM = 900`.

Given a string `s` representing a Roman numeral, convert it to an integer.

You may assume the input is always valid (1 ≤ s.length ≤ 15, and the string represents a number in the range [1, 3999]).

---

## Examples

**Example 1**
Input: s = "III"
Output: 3
Explanation: III = 3.

markdown
Copy code

**Example 2**
Input: s = "IV"
Output: 4
Explanation: IV = 5 − 1 = 4.

markdown
Copy code

**Example 3**
Input: s = "IX"
Output: 9
Explanation: IX = 10 − 1 = 9.

markdown
Copy code

**Example 4**
Input: s = "LVIII"
Output: 58
Explanation:
L = 50, V = 5, III = 3.

markdown
Copy code

**Example 5**
Input: s = "MCMXCIV"
Output: 1994
Explanation:
M = 1000, CM = 900, XC = 90, IV = 4.

markdown
Copy code

---

## Constraints

- `1 <= s.length <= 15`
- `s` contains only the characters: `('I','V','X','L','C','D','M')`
- It is guaranteed that `s` is a valid Roman numeral in the range `[1, 3999]`

---

## Approach (no full code solution)

Here are guiding ideas and hints:

1. **Scan from left to right or right to left**  
   You can parse each character and add its value, but you also need to detect subtraction patterns (e.g. `IV`, `IX`, `CM`, etc.).

2. **Look ahead logic**  
   For each symbol, if the next symbol represents a larger value, subtract current value; otherwise, add it.

3. **Use a map/dictionary**  
   Maintain a map from Roman symbol to integer value (I → 1, V → 5, etc.).

4. **Be careful with ordering**  
   When to subtract vs when to add. The usual logic is:
   - If `value(s[i]) < value(s[i+1])`, subtract `value(s[i])`
   - Else, add `value(s[i])`

5. **Edge cases**  
   - Short strings like length 1 (e.g. `"I"`)
   - Cases like `"XL"`, `"XC"`, `"CD"`, `"CM"`
   - Maximum length 15  
   - Validity is guaranteed, so you don’t need to handle invalid Roman strings

---

## Complexity

- **Time complexity:** O(n), where `n = s.length`  
- **Space complexity:** O(1) — using constant extra space for map, variables, etc.

---

## Test Cases / Corner Cases to Try

- `s = "III"` → 3  
- `s = "IV"` → 4  
- `s = "IX"` → 9  
- `s = "LVIII"` → 58  
- `s = "MCMXCIV"` → 1994  
- Minimal length: `s = "I"` → 1  
- Values with subtraction in the middle: `"XLII"`, `"XCIX"`, `"CMXCIV"`

---

## Notes

- This README intentionally omits actual code implementation.  
- You can use this scaffold when writing your solution or explaining it in your code.  






<!-- Updated for commit sequence -->
