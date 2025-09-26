class Solution {
    public static boolean isPalindrome(String s) {
        // Step 1: Convert to lowercase and remove non-alphanumeric characters
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Step 2: Check if the string is equal to its reverse
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(isPalindrome(s1)); // Output: true
        System.out.println(isPalindrome(s2)); // Output: false
    }
}
