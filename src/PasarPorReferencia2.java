    class Persona{
        private String nombre;
        public void modificarNombre(String nuevoNombre){
            this.nombre = nuevoNombre;
        }

        public String leernombre(){
            return this.nombre;
        }
    }


    public class PasarPorReferencia2 {
    public static void main(String[] args){

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("Iniciamos el método main => ");
        System.out.println(persona.leernombre());
                    ///////////////////////

        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test => ");
                    ///////////////////////

        System.out.println(persona.leernombre());
        System.out.println("Finalizamos el método con los datos de la persona modificado!" );
    }
    public static void test(Persona persona){
        System.out.println("Iniciamos el método test => ");
            persona.modificarNombre("Pepe");
        System.out.println("Finalizamos el método test");
    }


}