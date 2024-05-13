public class Kwadrat extends prostokat{
    public Kwadrat(String kolor,Punkt p1,int a)
    {
        super(kolor,p1,new Punkt(p1.getX()-a,p1.getY()-a));
    }
    @Override
    public String toString()
    {
        return "Kolor:"+getKolor()+"\nKwadrat:\n"+l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n" + l4.toString();
    }
}
