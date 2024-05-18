public class HolaMundo{
    public static void main(String[] args) {
        String saludar = "Holaaaaaaa en Javaaa";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 15;
        }
        System.out.println("numero2 = " + numero2);

        String nombre;
        nombre = "Maycol";

        if(numero>10){
                nombre = "Juan";
        }
        System.out.println("nombre= "+ nombre);


        int number = 10;
        if(number > 8){
            number = 15;
            System.out.println("number =>>" + number);

        }

    }


}