package codewars;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        System.out.println(validParentheses("(())((()())())"));
    }

    public static boolean validParentheses(String parens) {
        try {
            // remove all characters that are not parentheses and attempt to compile the resulting pattern
            Pattern.compile(parens.replaceAll("[^()]", ""));
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
