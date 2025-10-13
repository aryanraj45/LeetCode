# 009 — Palindrome Number

**Difficulty:** Easy

---

## Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

An integer is a **palindrome** when it reads the same backward as forward.

**Important:** Do **not** convert the integer to a string (unless you want to — but try to think of numeric approaches).

---

## Examples

**Example 1**

```
Input: x = 121
Output: true
Explanation: 121 reads the same backward and forward.
```

**Example 2**

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
             Therefore it is not a palindrome.
```

**Example 3**

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left which is not equal to 10.
```

---

## Constraints

* `-2^{31} <= x <= 2^{31} - 1`
* Input is a 32-bit signed integer.

---

## Edge cases to consider

* Negative numbers (should return `false` by definition because of the `-` sign).
* Numbers ending with `0` (e.g., `10`, `100`) — unless the number is `0`, these cannot be palindromes.
* Single-digit numbers (0–9) — always palindromes.
* Very large integers within 32-bit limits.

---

## Hints (no full solution)

1. Think about how you can compare digits without converting the number to a string.
2. You can reverse **part** of the number and compare, instead of reversing the whole integer (this avoids overflow concerns and extra work).
3. Watch out for numbers that end with `0` — they’re not palindromes unless the number is `0` itself.
4. Consider using modulo and integer division to extract digits.

---

## Suggested approach outlines (conceptual, **no code**)

* **Numeric reversal (full):** Reverse the whole number digit by digit and compare with the original. Be careful about overflow and negative numbers.

* **Half-reverse trick (recommended):** Reverse the last half of the digits and compare them to the first half. This avoids reversing the entire number and reduces overflow risk.

* **String method (simple, not always allowed):** Convert the integer to a string and check whether the string is equal to its reverse. This is straightforward but may be disallowed in some interviews.

---

## Complexity (expected)

* Time: O(d) where `d` is the number of digits in `x`.
* Space: O(1) for numeric solutions (O(d) if using the string approach).

---

## Related problems

* Reverse Integer (e.g., LeetCode 007)
* Palindromic Substrings / Longest Palindromic Substring

---

## How to test

* Test with `x = 0`, `x = 7`, `x = -1`, `x = 10`, `x = 121`, `x = 1221`, and large 32-bit boundary values.

---

*Notes: This README intentionally omits any full implementation or step-by-step code answer.*
