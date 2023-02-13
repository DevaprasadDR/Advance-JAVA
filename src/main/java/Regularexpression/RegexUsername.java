package Regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUsername {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email-id : ");

        String Username =  sc.nextLine();
        Pattern p = Pattern.compile ( "^[A-Za-z0-9_-]{5,15}$");
        Matcher m = p.matcher (Username);
        if (m.find () && m.group ().contentEquals (Username))
        {
            System.out.println ("Valid Mail ID");
        }
        else
        {
            System.out.println ("Invalid Mail ID");
        }
    }

}

