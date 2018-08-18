import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;
import java.util.Vector;
public class Concert extends Event
{
    public Concert()
    {
        addType();
        addTitle();
        addArtist();
        addDate();
        addPlace();
        addHall();
    }
    public Concert(String type, String title, String artist, int year, int month, int day, int hour, int minute, String city, String address, int num_line, int num_seat, int cof)
    {
        type_of_concert = type;
        this.title = title;
        this.artist = artist;
        time.set_Time(year, month, day, hour, minute);
        place.set_Place(city, address);
        myHall.num_line = num_line;
        myHall.num_seat = num_seat;
        myHall.cof = cof;
        myHall.setHall();
    }
    @Override
    public final void addType()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите тип концерта: ");
        String  type_of_concert = in.nextLine();

    }
    public final String getTypeOfConcert()
    {
        return type_of_concert;
    }
    public final String getTypeOfEvent()
    {
        return type_of_event;
    }


    private String type_of_event = " Концерт";
    private String type_of_concert;
}