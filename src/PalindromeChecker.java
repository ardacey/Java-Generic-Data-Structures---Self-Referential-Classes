public class PalindromeChecker {
    public static void palindromeChecker(String word) {

        if (isPalindrome(word)) {
            Io.writeToFile("\"" + word + "\" is a palindrome.", true);
        } else {
            Io.writeToFile("\"" + word + "\" is not a palindrome.", true);
        }
    }

    public static boolean isPalindrome(String word) {
        MyStack<Character> stack = new MyStack<>();
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < word.length(); i++) stack.push(word.charAt(i));

        for (int i = 0; i < word.length(); i++) {
            if (stack.pop() != word.charAt(i)) return false;
        }
        return true;
    }
}
