import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args){
       /* String[] usuarios = new String[3];
        String[] contraseñas = new String[3];
           usuarios[0]   = "Maycol";
        contraseñas[0] = "12345";

           usuarios[1] = "Josue";
        contraseñas[1] = "12345";

           usuarios[2] = "Antony";
        contraseñas[2] = "12345";*/

        String[] usuarios = {"Maycol", "Josue", "Antony"};
        String[] contraseñas = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del usuario:");

        String u = scanner.next();

        System.out.println("Ingrese contraseña del usuario:");
        String p = scanner.next();

        boolean esAutentico = false;

        for( int i = 0; i < usuarios.length; i++){
            if(usuarios[i].equals(u) && contraseñas[i].equals(p)){
                esAutentico = true;
                break;
            }
        }

        if(esAutentico){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Usuario o contraseña incorrecto");
            System.out.println("Lo sentimos, requiere autenticación");
        }
    }
}
