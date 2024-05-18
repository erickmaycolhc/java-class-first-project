package main.java.com.mitocode;

import java.time.LocalDate;
import java.util.*;

public class Retry {

    private void invertString(String text) {

        /*String[] arreglo = text.split(""); //. split para separar cada elemento
        StringBuilder nuevoText = new StringBuilder();  //StringBuilder constructor de cadenas de clase
        for(int i = arreglo.length; i > 0; i--){
            nuevoText.append(arreglo[i-1]);
        }
        System.out.println("newText = " + nuevoText);*/

        String[] array = text.split("");
        StringBuilder nuevo = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            nuevo.append(array[i - 1]);
        }
        //String newText = new StringBuilder(text).reverse().toString();
        System.out.println(nuevo);
    }

    private void capicua(int number) {
        String newText = String.valueOf(number); //valueOf para transformar int a String
        String reverseNumber = new StringBuilder(newText).reverse().toString();  //StringBuilder sirve para almacenar
        // cadenas de caracteres

        if (newText.equals(reverseNumber)) {
            System.out.println("is capicua");
        } else {
            System.out.println("not capicua");
        }

    }

    private void contadorCaracteres(String text) {
        int i, lenght, counter[] = new int[256];
        lenght = text.length();
        for (i = 0; i < lenght; i++) {
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    private void contadorCaracteresAletorio(String text) {
        int i, lenght, counter[] = new int[256];
        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char) i + ": " + counter[i]);

            }
        }
    }

    private void multiplos(int number) {
        if (number % 2 == 0) {
            System.out.println("Is multiple");
        } else {
            System.out.println("not multiple");
        }
    }

    private void añoBiciesto(int year) {
        boolean isBiciesto = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println("isBiciesto => " + isBiciesto);
    }


    private void randomOrderString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);  // asList convierte un conjunto de objetos en un array
                                                   // con un tamaño predeterminado que no se puede agregar o eliminar elementos.

        Collections.shuffle(list);   // Collections.shuffle() metodo para barajear aleatoriamente los elementos.

        list.forEach(System.out::println); // System.out::println  Esto es una forma concisa de lograr la misma salida que si hubieras utilizado un bucle
                                           // for para iterar a través de la lista e imprimir cada elemento por separado.
                                           // forEach para imprimir cada elemento de la lista
    }



    private void listaDondeNoApareceDuplicados(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);  //Crear una instancia de HashSet para almacenar elementos de tipo Integer garantiza que no haya elementos duplicados
        set.forEach(System.out::println);
    }

    private void ComprobarSiLaVocalEstaPresente(String text){
        /*String[] array = text.split("");

        boolean isPresent = false;
        for(String s: array){
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){       // equals se utiliza para comparar si dos objetos son iguales en cuanto a su contenido
                isPresent = true;
                break;
            }
        }
        System.out.println("isPresent = " + isPresent);
        */
        boolean result = text.matches(".*[aeiou].*");  // El método matches devolverá true si existe el elemente enviado de lo contrario false.
        System.out.println("result = " + result);            //  ".*[].*"  esta expresión regular busca coincidencias en una cadena.


        boolean rpta = Arrays.asList(text.split("")).stream().anyMatch( s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println("rpta = " + rpta);               //.stream(): Convierte la lista de caracteres en un flujo (stream) de caracteres.
                                                            //Arrays.asList(...): Convierte la matriz de caracteres resultante en una lista de caracteres.
                                                            //anyMatch para verificar si al menos uno de los caracteres en el flujo es igual a cualquiera.
    }


    private boolean Palindrome(String text){
        boolean result = true;
        int lenght = text.length();
        for(int  i= 0; i < lenght / 2; i++){ //se recorre la mitad de la cadena Esto se debe a que para verificar un palíndromo, solo necesitas comparar la primera
            if(text.charAt(i) != text.charAt(lenght - i -1)){                                                            // mitad de la cadena con la segunda mitad

            result = false;                               //es decir, length - i - 1). Si estos dos caracteres no son iguales, se establece result
                break;                                    // en false y el bucle se rompe con break.
            }
        }
        return result;                                    //charAt(i)  se utiliza para obtener el carácter en una posición específica dentro de una cadena.
    }


    public static void main(String[] args){
        Retry retry = new Retry();

        // retry.invertString("correr");
        // retry.capicua(505);
        // retry.contadorCaracteres("trujillo");
        // retry.contadorCaracteresAletorio("cuchillo");
        // retry.multiplos(6);
        // retry.añoBiciesto(2012);
        // retry.randomOrderString("trabajar");
        // retry.listaDondeNoApareceDuplicados(Arrays.asList(1,2,3,5,5,5,4,5,5,1,2,9));
        // retry.ComprobarSiLaVocalEstaPresente("dormir");
        System.out.println(retry.Palindrome("aca"));
    }


}

