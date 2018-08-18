import java.util.*;

import static java.util.Collections.swap;

public class User {


    public final void showEvent( ArrayList<Concert> concert, ArrayList<Festival> festival,  ArrayList<Theater> theater)
    {
        int i = 1;
        System.out.printf(String.valueOf(concert.size()));
        for (Concert c : concert) {
            System.out.printf("Number", i, c.getTypeOfEvent(), c.getTitle(), c.getArtist(), c.getDate(), c.getPlace(), c.MinPrice(), c.MaxPrice());
            i++;
        }

        for (Festival f : festival) {
            System.out.printf("Number", i, f.getTypeOfEvent(), f.getTitle(), f.getArtist(), f.getDate(), f.getPlace(), f.MinPrice(), f.MaxPrice());
            i++;
        }
        for (Theater t : theater) {
            System.out.printf("Number", i, t.getTypeOfEvent(), t.getTitle(), t.getArtist(), t.getDate(), t.getPlace(), t.MinPrice(), t.MaxPrice());
            i++;
        }
        System.out.printf("-");
    }

    public final void toReservate(ArrayList<Concert> concert,  ArrayList<Festival> festival,  ArrayList<Theater> theater)
    {
        int marker;
        int n; //номер в списке события
        System.out.print("Выберете тип события для которого хотите забронировать место");
        System.out.print("\n");
        System.out.print("1 - концерт, 2 - фестиваль, 3 - театральная постановка");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        marker = in.nextInt();

        switch (marker)
        {
            case 1:
                System.out.print("Введите номер концерта - ");
                n = in.nextInt();
                concert.get(n - 1).reserv();
                break;
            case 2:
                System.out.print("Введите номер концерта - ");
                n = in.nextInt();
                festival.get(n - 1).reserv();
                break;
            case 3:
                System.out.print("Введите номер концерта - ");
                n = in.nextInt();
                theater.get(n - 1).reserv();
                break;
            default:
                System.out.print("Проверьте введное значение!");
        }
    }
    public final void start(ArrayList<Concert> concert, ArrayList<Festival> festival, ArrayList<Theater> theater) { //основная функция
        int starter;
        System.out.print("1 - вывести на екран события, 2 - забронировать место");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        starter = in.nextInt();

        switch (starter) {
            case 1:
                System.out.print("Вывести: 1 - без сортировки; 2 - сортировка по цене; 3 - сортировка по именам учасников; 5 - сортировка по жанру; 6 - сортировка по месту проведения");
                System.out.print("\n");
                System.out.print("7 - выборка по дате; 8 - выборка по месту проведения; 9 - выборка по цене; 10 - выборка по имени учасника");
                System.out.print("\n");
                int n;
                n = in.nextInt();
                switch (n) {
                    case 1:

                        showEvent(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    case 2:

                        sortPrice(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;

                     case 3:

                        //sortames(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    /*case 5:

                        sort_type(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    case 6:

                        sort_place(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    case 7:

                        date_selection(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    case 8:

                        place_selection(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    case 9:

                       // price_selection(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                    case 10:
                        //name_selection(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
                        break;
                }
                break;
            case 2:
                toReservate(concert, festival, theater);
                break;
                }*/
                }
        }
    }

        public final void sortPrice (ArrayList<Concert> concert,  ArrayList<Festival> festival, ArrayList<Theater> theater)
        {
            //Òсортировка по цене
            System.out.print("Сортировка по цене: 1- от мин до макс, 2- от макс до мин");
            System.out.print("\n");
            int indicator;
            Scanner in = new Scanner(System.in);
            in = new Scanner(System.in);
            indicator = in.nextInt();

            switch (indicator) {
                case 1:
                    for (int i = 1; i < concert.size(); i++) {
                        for (int j = i; j > 0 && concert.get(j - 1).MinPrice() > concert.get(j).MinPrice(); j--) {
                            Collections.swap(concert, (j - 1), (j));
                        }
                    }
                    for (int i = 1; i < festival.size(); i++) {
                        for (int j = i; j > 0 && festival.get(j - 1).MinPrice() > festival.get(j).MinPrice(); j--) {
                            Collections.swap(festival, (j - 1), (j)); // меняем местами элементы j и j-1
                        }
                    }
                    for (int i = 1; i < theater.size(); i++) {
                        for (int j = i; j > 0 && theater.get(j - 1).MinPrice() > theater.get(j).MinPrice(); j--) {
                            Collections.swap(theater, (j - 1), (j));
                            ;
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i < concert.size(); i++) {
                        for (int j = i; j > 0 && concert.get(j - 1).MinPrice() < concert.get(j).MinPrice(); j--) {
                            Collections.swap(concert, (j - 1), (j)); // меняем местами элементы j и j-1
                        }
                    }
                    for (int i = 1; i < festival.size(); i++) {
                        for (int j = i; j > 0 && festival.get(j - 1).MinPrice() < festival.get(j).MinPrice(); j--) {
                            Collections.swap(festival, (j - 1), (j));
                        }
                    }
                    for (int i = 1; i < theater.size(); i++) {
                        for (int j = i; j > 0 && theater.get(j - 1).MinPrice() < theater.get(j).MinPrice(); j--) {
                            Collections.swap(theater, (j - 1), (j));
                        }
                    }
                    break;
            }
            showEvent(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
        }

    public void sortNames(ArrayList<Concert> concert) {
        concert.sort(new Comparator<Concert>() {
            @Override
            public int compare(Concert o1, Concert o2) {
                if (o1.getArtist() == o2.getArtist())
                    return 0;
                else if (o1.getArtist() < o2.getArtist())
                    return -1;
                else
                    return 1;
            }
        });
    }


  /*  public final void sortNames(ArrayList<Concert> concert, ArrayList<Festival> festival, ArrayList<Theater> theater)
    { //Сортировка по имени

        for (int i = 1; i < concert.size(); i++) {
            for (int j = i; j > 0 && concert.get(j - 1).getArtist() < concert.get(j).getArtist(); j--) {
                Collections.swap(concert, (j - 1), (j)); // меняем местами элементы j и j-1
            }
        }
        for (int i = 1; i < festival.size(); i++) {
            for (int j = i; j > 0 && festival.get(j - 1).MinPrice() < festival.get(j).MinPrice(); j--) {
                Collections.swap(festival, (j - 1), (j));
            }
        }
        for (int i = 1; i < theater.size(); i++) {
            for (int j = i; j > 0 && theater.get(j - 1).MinPrice() < theater.get(j).MinPrice(); j--) {
                Collections.swap(theater, (j - 1), (j));
            }
        }


        showEvent(new ArrayList<Concert>(), new ArrayList<Festival>(), new ArrayList<Theater>());
    }*/
    /*
    public final void sort_type(vector<Concert> concert, vector<Festival> festival, vector<Theater> theater)
    { //Сортировка п типу концерта
        for (int i = 1;i < concert.size();i++)
        {
            for (int j = i;j > 0 && concert[j - 1].getTypeOfConcert() > concert[j].getTypeOfConcert();j--)
            {
                swap(concert[j - 1],concert[j]); // меняем местами элементы j и j-1
            }
        }
        for (int i = 1;i < festival.size();i++)
        {
            for (int j = i;j > 0 && festival[j - 1].getTypeOfFestival() > festival[j].getTypeOfFestival();j--)
            {
                swap(festival[j - 1],festival[j]); // меняем местами элементы j и j-1
            }
        }
        for (int i = 1;i < theater.size();i++)
        {
            for (int j = i;j > 0 && theater[j - 1].getTypeOfTheater() > theater[j].getTypeOfTheater();j--)
            {
                swap(theater[j - 1],theater[j]); // меняем местами элементы j и j-1
            }
        }
}*/
}
