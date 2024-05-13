public class Punkt {

        private int x;
        private int y;

        public Punkt()
        {
            this.x = 0;
            this.y = 0;
        }
        public Punkt(int x,int y)
        {
            this.x = x;
            this.y = y;
        }

        public Punkt(Punkt p1)
        {
            this.x = p1.x;
            this.y = p1.y;
        }

        public void przesun(int a ,int b)
        {
            this.x+=a;
            this.y+=b;

        }
        @Override
        public String toString()
        {
            return "X:"+ this.x +" Y:"+ this.y;
        }
        public int getX()
        {
            return this.x;
        }
        public int getY()
        {
            return this.y;
        }



    }


