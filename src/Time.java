import java.lang.String;
import java.util.Scanner;

public class Time {

    public int compareTo(Time otherInstance)
    {
        if (lessThan(otherInstance))
        {
            return -1;
        }
        else if (otherInstance.lessThan(this))
        {
            return 1;
        }

        return 0;
    }

    public Time()
    {
        year = 2017;
        month = 1;
        day = 1;
        hour = 0;
        minute = 0;
    }
    public Time(int our_year, int our_month, int our_day, int our_hour, int our_minute)
    {
        this.year = our_year;
        this.month = our_month;
        this.day = our_day;
        this.hour = our_hour;
        this.minute = our_minute;
    }

    public final void setTime()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день¸: ");
        String day = in.nextLine();
        System.out.print("Введите месяц: ");
        String month = in.nextLine();

        System.out.print("Введите год:");
        String year = in.nextLine();
        System.out.print("Введите час: ");
        String hour = in.nextLine();
        System.out.print("Введите минуты: ");
        String minute = in.nextLine();

        if (!checkTime())
        {
            System.out.print("Неверно введены давнные!");
            System.out.print("\n");
        }
    }
    public final boolean checkTime()
    {
        if ((day > 0) && (day <= 31) && (month > 0) && (month <= 12) && (year > 0) && (hour >= 0) && (hour < 24) && (minute >= 0) && (minute < 60))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public final String IntToStr(int x)
    {
        String buf = new String(new char[20]);
        buf = String.format("%d", x);
        return buf;
    }
    public final String getTime()
    {
        return IntToStr(day) + "/" + IntToStr(month) + "/" + IntToStr(year) + " " + IntToStr(hour) + ":" + IntToStr(minute);
    }

    public boolean lessThan (Time time)
    {
        final int YEAR = 2016;
        final int DAY_IN_YEAR = 365;
        final int DAY_IN_MONTH = 30;
        final int HOUR = 24;
        final int MINUTES = 60;
        int allTime1 = (year - YEAR) * DAY_IN_YEAR * HOUR * MINUTES + (month - 1) * DAY_IN_MONTH * HOUR * MINUTES + (day - 1) * HOUR * MINUTES + (hour - 1) * MINUTES + minute;
        int allTime2 = (time.year - YEAR) * DAY_IN_YEAR * HOUR * MINUTES + (time.month - 1) * DAY_IN_MONTH * HOUR * MINUTES + (time.day - 1) * HOUR * MINUTES + (time.hour - 1) * MINUTES + time.minute;
        if (allTime1 < allTime2)
        {
            return true;
        }
        return false;
    }
    public final void set_Time(int year, int month, int day, int hour, int minute)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }


    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
}
