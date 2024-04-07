import java.util.Stack;

public class uczen {
    private String nazwisko;
    private Stack<Float> oceny = new Stack<>();

    uczen (String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setOcena(Float ocena){
        this.oceny.add(ocena);
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public Stack getOceny(){
        return oceny;
    }
}
