package Regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCharacters {

    public static void main(String[] args) {

        String strSource = "aAVEtsvT4528~!@#$%^&*097DwrYi()_+{}[]:;,.<>/?-";

        String strPattern = "[^a-zA-Z0-9_]";

        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(strSource);

        if(m.find()) {
            System.out.println("String contains character(s)");
        }
        strSource = strSource.replaceAll(strPattern, "");

        System.out.println(strSource);

    }
}
