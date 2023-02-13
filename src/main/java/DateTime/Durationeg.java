package DateTime;

import java.time.LocalTime;
import java.time.Duration;


public class Durationeg {
    public static void checkingDuration()
    {
        LocalTime time1 = LocalTime.now ();
        System.out.println ("the current time is " + time1);
        Duration fiveHours = Duration.ofHours (5);
        LocalTime time2 = time1.plus (fiveHours);
        System.out.println ("after adding five hours " +"of duration " + time2);
        Duration gap = Duration.between (time2, time1);
        System.out.println ("duraion gap between time1" + " & time2 is " + gap);
    }


    public static void main (String[]args)
    {
        checkingDuration();
    }
}
