import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;
import java.lang.String;
import java.util.Vector;
import java.util.List;
import java.util.Iterator;



public class Admin {

    public final void addEvent(  ArrayList<Concert> concert,  ArrayList<Festival> festival,  ArrayList<Theater> theater)
    { //функция добавления события
        int type;
        boolean indicator = true;
        while (indicator)
        {
            System.out.print("Выберете тип события: 1 - концерт, 2 - фестиваль, 3 - театральное событие");
            System.out.print("\n");
            Scanner in = new Scanner(System.in);
            type  = in.nextInt();
            switch (type)
            {
                case 1:

                    concert.add(new Concert());
                    break;
                case 2:
                    festival.add(new Festival());
                    break;
                case 3:
                    theater.add(new Theater());
                    break;
                default:
                    System.out.print("Введены не 1, 2, 3");
                    System.out.print("\n");
            }

            System.out.print("Если хотите выйти из режима добавления событий нажмите 0, иначе 1");
            System.out.print("\n");

            type  = in.nextInt();
            if (type == 0)
            {
                indicator = false;
            }
        }
    }
    public final void start( ArrayList<Concert> concert,  ArrayList<Festival> festival,  ArrayList<Theater> theater)
    { //основная функция
        int variant;
        boolean indicator = true;
        while (indicator)
        {
            System.out.print("Выберете что делать: 1 - добавить события, 2 - вывести на экран события, 3 - выйти из администратора");
            System.out.print("\n");
            Scanner in = new Scanner(System.in);
            variant  = in.nextInt();

            switch (variant)
            {
                case 1:
                    addEvent(concert, festival, theater);
                    break;
                case 2:
                    //add_object();
                    showEvent(concert, festival, theater);
                    break;
                case 3:
                    indicator = false;
                    break;
                default:
                    System.out.print("Проверьте введное значение!");
            }
        }
    }


    public final void showEvent( ArrayList<Concert> concert,  ArrayList<Festival> festival,   ArrayList<Theater> theater) {
        int i = 1;
        System.out.printf(String.valueOf(concert.size()));
       for (Concert c : concert) {
            System.out.printf("-" + "Number", i, c.getTypeOfEvent(), c.getTypeOfEvent(), c.getTitle(), c.getArtist(), c.getDate(), c.getPlace(), c.MinPrice(), c.MaxPrice());
            i++;
        }

        for (Festival f : festival) {
            System.out.printf("-" + "Number", i, f.getTypeOfEvent(), f.getTitle(), f.getArtist(), f.getDate(), f.getPlace(), f.MinPrice(), f.MaxPrice());
            i++;
        }
        for (Theater t : theater) {
            System.out.printf("-" + "Number", i, t.getTypeOfEvent(), t.getTitle(), t.getArtist(), t.getDate(), t.getPlace(), t.MinPrice(), t.MaxPrice());
            i++;
        }
        System.out.printf("-");
    }


}


