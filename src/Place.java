 import java.lang.String;
 import java.util.Scanner;

 public class Place {
    public Place()
    {
        city = "no_city";
        address = "no_adress";
    }
    public Place(String our_city, String our_address)
    {
        this.city = our_city;
        this.address = our_address;
    }
    public final void setPlace()
    { //установка место проведения
        Scanner in = new Scanner(System.in);
        System.out.print("Введите город: ");
        String city = in.nextLine();
        System.out.print("Введите адресс: ");
        String adress = in.nextLine();
    }
    public final String getPlace()
    { //вывод места
        return address + ", " + city;
    }
    public final void set_Place(String city, String address)
    {
        this.city = city;
        this.address = address;
    }


    private String city;
    private String address;
}
