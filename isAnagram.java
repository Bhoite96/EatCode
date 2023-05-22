import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Your code here
        // For example, you might want to check if the lengths of the two strings are the same
        if (s.length() != t.length()) {
            return false;
        }

        // Then you might want to sort the characters in each string and compare them
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // return Arrays.equals(sArray, tArray);

        // Return some value until you implement your solution
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Replace with your test cases
        System.out.println(solution.isAnagram("test", "tset")); // true
        System.out.println(solution.isAnagram("hello", "world")); // false
    }
}
