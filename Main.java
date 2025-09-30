
public class Main {
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        Persona perso2 = new Persona();
        Vehiculo vehi = new Vehiculo();

        Persona.Estudiante p1 = perso1.new Estudiante();
        Persona.Profesor p2 = perso2.new Profesor();
        Vehiculo.Bicicleta bici = vehi.new Bicicleta();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(bici);

    }
}
