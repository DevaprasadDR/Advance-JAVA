package Regularexpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexverify {
    public static void main (String[]args) throws  IOException {
        PrintWriter out = new PrintWriter ("src/Files/"+FileName()+"valid.txt");
        BufferedReader br = new BufferedReader (new FileReader("src/Files/input.txt"));
        Pattern p = Pattern.compile ("[7-9][0-9]{9}");
        String line = br.readLine ();
        while (line != null)
        {
            Matcher m = p.matcher (line);
            while (m.find ())
            {
                out.println (m.group ());
            }
            line = br.readLine ();
        }
        out.flush ();
    }

    public static String FileName() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        return dateFormat.format(date);
    }
}