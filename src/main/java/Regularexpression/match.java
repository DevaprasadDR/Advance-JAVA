package Regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class match {
    public static void main(String args[])
    {
        Pattern pattern = Pattern.compile("regular expression");


        Matcher m = pattern.matcher("A regular expression is a sequence " +
                "of characters that forms a search pattern. ");
        if(m.find()) {
            System.out.println("Pattern found from "
                    + m.start() + " to "
                    + (m.end() - 1));
        } else {
            System.out.println("Match not found");
        }
    }
}
