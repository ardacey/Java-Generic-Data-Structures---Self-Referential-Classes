# Java Data Structure Utilities

A small Java console project that demonstrates custom stack, queue, and circular doubly linked list implementations through four classic operations:

- Convert base-10 numbers to binary
- Count from 1 to _n_ in binary
- Check whether a word or sentence is a palindrome
- Check whether an expression has balanced parentheses

## Project Structure

- `src/` contains the Java source files
- `examples/` contains a sample input/output pair

## Requirements

- Java 8 or newer

## Run

Compile the source files:

```bash
javac src/*.java
```

Run the program with an input file and an output file:

```bash
java -cp src Main examples/sample-input.txt examples/sample-output.txt
```

The program reads a command script from the input file and writes the results to the output file.

## Input Format

Each command is followed by its value on the same line, separated by a tab.

Supported commands:

- `Convert from Base 10 to Base 2:` followed by an integer
- `Count from 1 up to n in binary:` followed by an integer
- `Check if following is palindrome or not:` followed by a string
- `Check if following expression is valid or not:` followed by an expression

## Notes

- The output file is cleared before each run.
- The sample files under `examples/` are provided for quick testing and can be replaced with your own input and output paths.