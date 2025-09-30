public class Persona {

    public String presentarse() {
        return "Hola";
    }

    public class Estudiante extends Persona {

        @Override
        public String presentarse() {
            return "El estudiante tambien dice hola";
        }
        @Override
        public String toString() {
            return presentarse();
        }
    }

    public class Profesor extends Persona {

        @Override
        public String presentarse() {
            return "El profesor tambien dice hola";
        }

        @Override
        public String toString() {
            return presentarse();
        }
    }
}
