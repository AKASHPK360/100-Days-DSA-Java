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
