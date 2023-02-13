package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateAdjust {
    public static void checkingAdjusters ()
    {
        LocalDate date = LocalDate.now ();
        System.out.println ("the current date is " + date);
        LocalDate dayOfNextMonth =date.with (TemporalAdjusters.firstDayOfNextMonth ());
        System.out.println ("first Day Of NextMonth : " + dayOfNextMonth);
        LocalDate nextSaturday = date.with (TemporalAdjusters.next (DayOfWeek.SATURDAY));
        System.out.println ("next satuday from now is " + nextSaturday);
        LocalDate firstDay = date.with (TemporalAdjusters.firstDayOfMonth ());
        System.out.println ("first Day Of Current Month : " + firstDay);
        LocalDate lastDay = date.with (TemporalAdjusters.lastDayOfMonth ());
        System.out.println ("lastDay Of Current Month : " + lastDay);
    }
    public static void main (String[]args)
    {
        checkingAdjusters ();
    }
}
