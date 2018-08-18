import java.util.Scanner;

public class Festival extends Event
{
    public Festival() {

        addType();
        addTitle();
        addArtist();
        addDate();
        addPlace();
        addHall();
    }

    public Festival(String type, String title, String artist, int year, int month, int day, int hour, int minute, String city, String address, int num_line, int num_seat, int cof) {
        type_of_festival = type;
        this.title = title;
        this.artist = artist;
        time.set_Time(year, month, day, hour, minute);
        place.set_Place(city, address);
        myHall.num_line = num_line;
        myHall.num_seat = num_seat;
        myHall.cof = cof;

    }

    @Override
    public final void addType() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите тип фестиваля: ");
        String type_of_festival = in.nextLine();
    }

    public final String getTypeOfFestival() {
        return type_of_festival;
    }

    public final String getTypeOfEvent() {
        return type_of_event;
    }

    private String type_of_event = "ФЕСТИВАЛЬ";
    private String type_of_festival;
    private int pricefan;
    private int pricevip;
}