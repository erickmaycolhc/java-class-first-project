public class EjemploStringValidar {
    public static void main(String[] args){
        String curso = null;
        boolean isnulo = curso == null;

        System.out.println("isnulo = " + isnulo);


        if(isnulo){
            curso = "Programación Java";
        }

        boolean isVacio = curso.length() == 0;
        System.out.println("isvacio = " + isVacio);

        boolean isVacio2 = curso.isEmpty();
        System.out.println("isVacio2 = " + isVacio2);

        boolean isVacio3 = curso.isBlank();
        System.out.println("isVacio3 = " + isVacio3);

        if(!isVacio3){
            System.out.println(curso.toUpperCase());  //toUpperCase convertir a mayuscula
            System.out.println("Bienvenidos al curso".concat(curso));
        }


    }
}
