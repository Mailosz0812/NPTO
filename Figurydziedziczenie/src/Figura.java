public class Figura {
    protected String kolor;

    public Figura(String kolor)
    {
        setKolor(kolor);
    }
    public String getKolor()
    {
        return this.kolor;
    }
    public void setKolor(String kolor)
    {
        if(!kolor.matches("[a-z]+"))
        {
            System.out.println("Nazwa koloru sklada sie tylko z malych liter");
        }
        else
        {
            this.kolor = kolor;
        }
    }
}
