package Regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPassword {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password : ");

        String password =  sc.nextLine();
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&',~$=<>]).{8,20}$");
                //("^(?=(.*[A-Z]){1})(?=(.*[a-z]){1,})(?=(.*[\\d]){1})(?!.*\\s).{8}$");

        Matcher m = p.matcher (password);
        if (m.find () && m.group ().contentEquals (password))
        {
            System.out.println ("Valid Password");
        }
        else
        {
            System.out.println ("Invalid Password");
        }
    }
}
