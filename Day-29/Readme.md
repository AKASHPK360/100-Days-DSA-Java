🚀 Day 30 — 100 Days of DSA with Java

🧩 Problem

LeetCode 1047 — Remove All Adjacent Duplicates In String

Given a string s, repeatedly remove adjacent duplicate characters until no duplicates remain.

Example
Input:  "abbaca"
Output: "ca"

🧠 Concepts Learned

* Stack-based problem solving
* LIFO principle
* Using StringBuilder as a Stack
* Comparing the current character with the Stack top
* Removing adjacent duplicates efficiently

💡 Approach

1. Create a StringBuilder to act as a Stack.
2. Traverse the string character by character.
3. Compare the current character with the last character in the Stack.
4. If they are equal, remove the Stack’s top character.
5. Otherwise, add the current character to the Stack.
6. Return the remaining characters.

Pattern
Current == Stack Top
        ↓
      REMOVE

Current != Stack Top
        ↓
       PUSH

 💻 Java Solution

 class Solution {
    public String removeDuplicates(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (stack.length() > 0 &&
                stack.charAt(stack.length() - 1) == ch) {

                stack.deleteCharAt(stack.length() - 1);

            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}

⏱️ Complexity

* Time Complexity: O(n)
* Space Complexity: O(n)

🎯 Key Takeaway

A Stack is useful when we need to compare the current element with the most recently stored element.

Today I focused on understanding the Stack pattern instead of just memorizing the solution.

📈 Progress

Day 30 / 100 ✅

Continuing the journey one problem at a time. 🚀
