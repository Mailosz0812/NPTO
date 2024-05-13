public class Czworokat extends Figura{
    protected Linia l1;
    protected Linia l2;
    protected Linia l3;
    protected Linia l4;

    public Czworokat(String kolor,Punkt p1,Punkt p2,Punkt p3,Punkt p4)
    {
        super(kolor);
        l1 = new Linia(p1,p2);
        l2 = new Linia(p2,p3);
        l3 = new Linia(p3,p4);
        l4 = new Linia(p4,p1);
    }
    @Override
    public String toString()
    {
        return "Kolor:"+getKolor()+"\nCzworokat:\n"+l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString();
    }

}
