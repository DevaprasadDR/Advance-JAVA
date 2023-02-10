package Regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressmail {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email-id : ");

        String EmailId =  sc.nextLine();
        Pattern p = Pattern.compile ("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+");
        Matcher m = p.matcher (EmailId);
        if (m.find () && m.group ().contentEquals (EmailId))
        {
            System.out.println ("Valid Mail ID");
        }
        else
        {
            System.out.println ("Invalid Mail ID");
        }
    }
}
