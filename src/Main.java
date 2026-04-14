import java.io.IOException;

public class Main {
    public static String input, output;
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java Main <input-file> <output-file>");
            System.err.println("Example: java Main examples/sample-input.txt examples/sample-output.txt");
            return;
        }

        input = args[0];
        output = args[1];
        CommandHandler.commandHandler();
    }
}