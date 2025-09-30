public class Persona {
    String nombre;

    public String presentarse() {
        System.out.println("Hola");
        return presentarse();
    }

    public class Estudiante extends Persona {
        String matricula;

        @Override
        public String presentarse() {
            System.out.println("El estudiante dice hola");
            return presentarse();
        }

    }

    public class Profesor extends Persona {

        @Override
        public String presentarse() {
            System.out.println("El profesor dice hola tambien");
            return presentarse();
        }

        @Override
        public String toString() {
            return presentarse();
        }
    }
}
