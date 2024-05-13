 public class Linia {
        private Punkt p1;
        private Punkt p2;

        public Linia()
        {
            p1 = new Punkt();
            p2 = new Punkt(0,1);
        }
        public Linia(Punkt p1,Punkt p2)
        {
            this.p1 = new Punkt(p1);
            this.p2 = new Punkt(p2);
        }
        public Linia(Linia l1)
        {
            this.p1 = new Punkt(l1.p1);
            this.p2 = new Punkt(l1.p2);
        }
        public void przesun(int a, int b)
        {
            this.p1.przesun(a,b);
            this.p2.przesun(a,b);
        }
        @Override
        public String toString()
        {
            return p1.toString() + " " + p2.toString();
        }

    }
