public class EjemploStringMetodos {
    public static void main(String[] args){
        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length()); //contador de caracteres
        System.out.println("nombre.toUpperCase() => " + nombre.toUpperCase()); //mayuscula
        System.out.println("nombre.toLowerCase() => " + nombre.toLowerCase()); //minuscula
        System.out.println("nombre.equals(\"Andres\") => " + nombre.equals("Andres")); //comparar
        System.out.println("nombre.equals(\"andres\") => " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") => " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") => " + nombre.compareTo("Andres")); //si es 0 es porque son iguales
        System.out.println("nombre.compareTo(\"andres\") => " + nombre.compareTo("andres"));
        System.out.println("nombre.charAt(0) => " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) => " + nombre.charAt(1)); //sacar dato por posición
        System.out.println("nombre.charAt(nombre.length()-1) => " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) => " + nombre.substring(1));  //obtener el resto de la posición
        System.out.println("nombre.substring(1,4)" + nombre.substring(1,4)); //obtener caracteres según la posición
        System.out.println( "nombre.substring(nombre.length()-2) => " + nombre.substring(nombre.length()-2)); //obtener los ultimos caracteres

        String trabaLenguas = "Trabalenguas";
        System.out.println("trabalenguas => "+ trabaLenguas.replace("a", ".")); //para cambiar datos
        System.out.println(trabaLenguas);

        System.out.println("trabalenguas.indexOf(\"a\") => " + trabaLenguas.indexOf("a")); // obtener la primera posición que hayas especificado
        System.out.println("trabaLenguas.lastIndexOf(\"a\") => " + trabaLenguas.lastIndexOf("a")); //obtener la ultima posición que hayas especificado
        System.out.println("trabaLenguas.indexOf(\"z\") => " + trabaLenguas.indexOf("lenguas")); // si no encuentra las posición retorna un numero negativo  -1
        System.out.println("trabaLenguas.contains(\"lenguas\") => " + trabaLenguas.contains("lenguas")); // true o false si existe o no el dato especificado
        System.out.println("trabaLenguas.startsWith(\"lenguas\") => " + trabaLenguas.startsWith("Traba")); //true si comienza con la primera letra
        System.out.println("trabaLenguas.endsWith(\"lenguas\") => " + trabaLenguas.endsWith("lenguas")); //true si comienza con la última letra
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); //quita los espacios en blanco del lado izquierda y derecho



    }
}
