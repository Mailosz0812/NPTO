public class Trojkat extends Figura{
    private Linia l1;
    private Linia l2;
    private Linia l3;

    public Trojkat(String kolor,Punkt p1,Punkt p2,Punkt p3)
    {
        super(kolor);
        l1 = new Linia(p1,p2);
        l2 = new Linia(p2,p3);
        l3 = new Linia(p3,p1);
    }
    @Override
    public String toString()
    {
        return "Kolor:"+getKolor()+"\nTrojkat:\n"+l1.toString() + "\n" + l2.toString() + "\n" + l3.toString();
    }

}
