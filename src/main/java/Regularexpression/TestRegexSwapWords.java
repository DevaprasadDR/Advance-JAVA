package Regularexpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestRegexSwapWords {
    public static void main(String[] args) {
        String inputStr = "apple orange";
        String regexStr = "^(\\S+)\\s+(\\S+)$";
        String replacementStr = "$2 $1";
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(inputStr);

        String outputStr = matcher.replaceFirst(replacementStr);
        System.out.println(outputStr);
    }
}