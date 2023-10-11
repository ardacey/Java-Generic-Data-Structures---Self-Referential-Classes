import java.io.IOException;
public class CommandHandler {
    public static void commandHandler() throws IOException {
        Io.fileCleaner();
        String[] lines = Io.readFile(Main.input);
        for (int i = 0; i < lines.length; i++){
            switch (lines[i]) {
                case "Convert from Base 10 to Base 2:":
                    BaseConverter.convertToBinary(Integer.parseInt(lines[i + 1]));
                    break;
                case "Check if following expression is valid or not:":
                    ParenthesisChecker.parenthesisChecker(lines[i + 1]);
                    break;
                case "Check if following is palindrome or not:":
                    PalindromeChecker.palindromeChecker(lines[i + 1]);
                    break;
                case "Count from 1 up to n in binary:":
                    BinaryCounter.binaryCounter(Integer.parseInt(lines[i + 1]));
                    break;
            }
        }
    }
}
