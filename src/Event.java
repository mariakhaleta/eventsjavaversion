import java.util.Scanner;

public abstract class Event
{
    //  Event();
    public final void reserv()
    { //резерв
        Scanner in = new Scanner(System.in);
        int line;
        int seat;
        myHall.getHall();
        System.out.print("Введите ряд и место для резервирования");
        System.out.print("\n");
        line = in.nextInt();
        seat = in.nextInt();
        myHall.reservation(line, seat);
    }
    public final String getDate()
    {
        return time.getTime();
    }
    public final String getPlace()
    {
        return place.getPlace();
    }
    public final String getArtist()
    {
        return artist;
    }
    public final String getTitle()
    {
        return title;
    }
    public final double MaxPrice()
    {
        return myHall.maxPrice();
    }
    public final double MinPrice()
    {
        return myHall.minPrice();
    }

    protected String title;
    protected String type_of_event; //типа ивент
    protected String artist; //артист
    public Time time = new Time();
    protected Place place = new Place();

    protected final void addDate()
    { //установка времени
        time.setTime();
    }
    protected final void addPlace()
    { //установка места
        place.setPlace();
    }

    protected abstract void addType();

    protected int num_seat; //сидения
    protected int num_line; //линия
    protected int our_cof; //коеф
    protected Hall myHall = new Hall();

    protected final void addHall()
    { //давбаление холла
        Scanner in = new Scanner(System.in);
        System.out.print("Введите через пробел количество мест, количество линий, значение коефициента: ");
        int num_seat = in.nextInt();
        int num_line = in.nextInt();
        int our_cof = in.nextInt();

        myHall.num_seat = num_seat;
        myHall.num_line = num_line; //линия
        myHall.cof = our_cof; //коеф
        myHall.setHall();
        //myHall.getHall(); //холл
    }
    protected final void addArtist()
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Добавить артиста или группу: ");
        String artist = in.nextLine();
    }
    protected final void addTitle()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Добавьте название события:  ");
        String title = in.nextLine();
    }

}