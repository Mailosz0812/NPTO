import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class dziennik {
    private int klasa;
    private Stack<uczen> dziennik1 = new Stack<>();

    dziennik(int klasa){
        this.klasa = klasa;
    }
    public void addStudent(String nazwisko){
        uczen nStudent = new uczen(nazwisko);
        dziennik1.add(nStudent);
    }
    public Stack getOceny(String nazwisko){
        for(int i = 0; i < dziennik1.size(); i++){
            uczen tStudent = dziennik1.elementAt(i);
            if(tStudent.getNazwisko() == nazwisko){
                return tStudent.getOceny();
            }
        }
        return null;
    }




}

