import java.util.ArrayList;
public class Hall {
    public Hall()
    {
    } //конструктор
    public Hall(int row, int col)
    {
        this.num_line = row;
        this.num_seat = col;
        //setHall();
    } //конструктор

    public int cof;
    public int num_line; //
    public int num_seat; //

   public final void setHall()
    { //установка значений мест по умолчанию true. true - значит что место свободно
        for (int i = 0; i < num_line; ++i)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            ArrayList<Price> temp2 = new  ArrayList<Price>();
            for (int j = 0; j < num_seat; ++j)
            {
                temp.add(1);
               temp2.add(new Price(cof, i));
            }
            matrix.add(temp);
            price.add(temp2);
        }
    }
    public final void getHall()
    { //метод вывода мест
        for (int i = 0; i < matrix.size(); i++)
        {
            for (int j = 0; j < matrix.get(i).size(); j++)
            {
                System.out.print(matrix.get(i).get(j));
            }
            System.out.printf("%4d", "\n");
        }

        System.out.printf("%4d", "Цена для каждого места:");
        System.out.printf("%4d", "\n");

        for (int i = 0; i < price.size(); i++) //вывод цены для каждого места
        {
            for (int j = 0; j < price.get(i).size(); j++)
            {
                System.out.printf("%4d", price.get(i).get(j).getPrice());
                System.out.printf("%4d", "$");
            }
            System.out.printf("%4d", "\n");
        }
    }
    public final void reservation(int line, int seat)
    { //метод бронировки мест
        ArrayList<Integer> liner=matrix.get(line-1);
        ArrayList<Integer> seatr=matrix.get(seat-1);

            System.out.print("Поздравляем вы зарезервировали место!");
            System.out.print("\n");

    }
    public final double maxPrice()
    { //расчёт максимальной цены билета.
        return price.get(num_line-1).get(num_seat - 1).getPrice();
    }
    public final double minPrice()
    { //расчёт максимальной цены билета.
        return price.get(0).get(0).getPrice();
    }


    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> liner = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> seatr = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Price>> price = new ArrayList<ArrayList<Price>>();


}
