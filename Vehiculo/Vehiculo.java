public class Vehiculo {
    String marca;

    public String moverse() {
        return "El objeto se mueve";
    }

    public class Bicicleta extends Vehiculo {

        @Override
        public String moverse() {
            return "La bicicleta se mueve";
        }

        @Override
        public String toString() {
            return moverse();
        }
    }
}
