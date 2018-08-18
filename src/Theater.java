import java.util.Scanner;

public class Theater extends Event
{
    public Theater()
    {
        addType();
        addTitle();
        addArtist();
        addDate();
        addPlace();
        addHall();
    }
    public Theater(String type, String title, String artist, int year, int month, int day, int hour, int minute, String city, String address, int num_line, int num_seat, int cof)
    {
        type_of_theater = type;
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
        System.out.print("Введите тип театрального представления: ");
        String type_of_theater = in.nextLine();

    }
    public final String getTypeOfTheater()
    {
        return type_of_theater;
    }
    public final String getTypeOfEvent()
    {
        return type_of_event;
    }


    private String type_of_event = "Театр";
    private String type_of_theater;
}