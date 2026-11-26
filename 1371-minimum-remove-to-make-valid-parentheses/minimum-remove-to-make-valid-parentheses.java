class Solution {
    public String minRemoveToMakeValid(String s) {
       
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Step 1: Remove invalid closing parentheses
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    sb.append(ch);
                }
            } 
            else {
                if (ch == '(') {
                    stack.push(ch);
                }
                sb.append(ch);
            }
        }

        // Step 2: Remove unmatched opening parentheses
        StringBuilder result = new StringBuilder();

        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);

            if (ch == '(' && !stack.isEmpty()) {
                stack.pop();
            } 
            else {
                result.append(ch);
            }
        }

        return result.reverse().toString();
    }
}
