public class Price {
    public Price(int cof, int line)
    { //установка коеф и линии

        setPrice(cof, line);
    }
    public final double setPrice(int cof, int line)
    {
        price = cof * (line+1); //установка цены за билет
        return price;
    }
    public final double getPrice()
    {

        return price;
    }

    private double price;
}
