public class prostokat extends Czworokat {
    public prostokat(String kolor, Punkt p1,Punkt p2)
    {
        super(kolor,p1,new Punkt(p2.getX(),p1.getY()),p2,new Punkt(p1.getX(),p2.getY()));
    }
    @Override
    public String toString()
    {
        return "Kolor:"+getKolor()+"\nProstokat:\n"+l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString();
    }
}
