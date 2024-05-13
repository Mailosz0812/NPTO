import java.util.Stack;

public class uczen {
    private String nazwisko;
    private Stack<Double> oceny = new Stack<>();

    public uczen (String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setOcena(Float ocena){
        this.oceny.add(ocena);
    }
    public String getNazwisko() {
        return oceny;
    }
    public Stack getOceny(){
        return oceny;
    }
}
