public class Vehiculo {
    String marca;

    public String moverse() {
        System.out.println("El objeto se mueve");
        return moverse();
    }

    public class Bicicleta extends Vehiculo {
        String etiqueta;
        @Override
        public String moverse() {
            System.out.println("La bicicleta se mueve");
            return moverse();
        }
        @Override
        public String toString() {
            return moverse();
        }
    }
}
