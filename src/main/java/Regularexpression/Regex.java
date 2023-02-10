package Regularexpression;

import java.util.regex.Pattern;

public class Regex {

        public static void main(String args[]){

            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "java12"));
            System.out.println(Pattern.matches("[a-zA-Z0-9]{10}", "DevaPrasad"));
            System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "JA2Uk2"));
            System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "arun$2"));
        }
}
