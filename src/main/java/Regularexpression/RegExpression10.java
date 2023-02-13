package Regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression10 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mobile number : ");
        String MobileNumber = sc.nextLine();
        //Pattern p = Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Pattern p = Pattern.compile ("[7-9][0-9]{9}");
        Matcher m = p.matcher (MobileNumber);
        if (m.find () && m.group ().equals (MobileNumber))
        {
            System.out.println ("Valid Number");
        }
        else
        {
            System.out.println ("Invalid Number");
        }
    }
}
