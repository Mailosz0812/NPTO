// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura("czerwony");
        Czworokat cz1 = new Czworokat("niebieski",new Punkt(5,0),new Punkt(3,3),new Punkt(1,3),new Punkt(0,0));
        Punkt p1 = new Punkt(2,0);
        Punkt p2 = new Punkt(5,2);
        Punkt p3 = new Punkt(4,6);
        Punkt p4 = new Punkt(6,0);
        Trojkat t1 = new Trojkat("zielony",p1,p2,p3);
        prostokat pr1 = new prostokat("fioletowy",new Punkt(4,2),p4);
        Kwadrat k1 = new Kwadrat("turkusowy",p2,5);
        System.out.println(figura);
        System.out.println("\n");
        System.out.println(cz1);
        System.out.println("\n");
        System.out.println(t1);
        System.out.println("\n");
        System.out.println(pr1);
        System.out.println("\n");
        System.out.println(k1);

    }
}