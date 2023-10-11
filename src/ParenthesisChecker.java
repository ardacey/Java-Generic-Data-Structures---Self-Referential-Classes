public class ParenthesisChecker {
    public static void parenthesisChecker(String word){
        if (isValidExpression(word)) {
            Io.writeToFile("\"" + word + "\" is a valid expression.", true);
        } else {
            Io.writeToFile("\"" + word + "\" is not a valid expression.", true);
        }
    }

    public static boolean isValidExpression(String line) {
        MyStack<Character> stack = new MyStack<>();

        for (char ch : line.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);

            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) return false;
            }
        }

        return stack.isEmpty();
    }
}