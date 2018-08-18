import javafx.event.Event;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class Main {

    public static void main(String[] args)

    {
        ArrayList<Concert> concert = new  ArrayList<Concert>();
        ArrayList<Festival> festival = new   ArrayList<Festival>();
        ArrayList<Theater> theater = new   ArrayList<Theater>();
        Admin admin = new Admin();
        User user = new User();
        //DB db = new DB();
        int x;
        //db.add_object(concert, festival, theater);
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Выберете контролер: 1 - администратор, 2 - пользователь, 3 - выйти");
            System.out.print("\n");
            x = in.nextInt();

            if (x == 1)
            {
                admin.start(concert, festival, theater);
            }
            else if (x == 2)
            {
                user.start(concert, festival, theater);
            }
            else if (x == 3)
            {
                break;
            }
        }
        //setlocale(LC_ALL, "Russian");




    }
}

