public class Tube
    implements Tool{

        int Diameter;
        Tube( int Diameter){ this.Diameter = Diameter;}
        @Override
        public void play() {
            System.out.printf("Играет Труба, диаметр: %s %s ", Diameter, "  ");
        }

    }

