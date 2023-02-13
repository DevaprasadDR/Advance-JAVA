package Regularexpression;

import java.util.regex.Pattern;

public class Delimiter {
    public static void main(String args[])
    {
        String text = "geeks1for2geeks3";

        String delimiter = "\\d";
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);

        String[] result = pattern.split(text);

        for (String temp : result)
            System.out.println(temp);
    }
}
