    import java.util.Scanner;

    public class DetalleDeFactura {
        public static void main(String[] args){
            Scanner factura = new Scanner(System.in);
            double primeraCompra;
            double segundaCompra;
            double sumaDeLasCompras;
            double totalDeCompras;
            String nombreFactura;

            System.out.println("Ingrese nombre de la factura: ");
            nombreFactura = factura.nextLine();


            System.out.println("Ingrese monto primera compra");
            totalDeCompras = factura.nextDouble();
             primeraCompra = totalDeCompras;

            System.out.println("Ingrese monto segunda compra");
            totalDeCompras = factura.nextDouble();
            segundaCompra = totalDeCompras;

            sumaDeLasCompras = ((primeraCompra + segundaCompra) * 100) / 19;
            totalDeCompras = primeraCompra + segundaCompra + sumaDeLasCompras;
            System.out.println("*****************************************************************************************************");
            System.out.println("La factura " + nombreFactura +  " tiene un total de " + primeraCompra + ", con un impuesto de" +
                               segundaCompra+ " y el monto después de \n impuesto es de " + totalDeCompras);
            System.out.println("*****************************************************************************************************");
        }
    }
        /*Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un nombre para la factura:");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese un precio de producto:");
                    double precio1 = scanner.nextDouble();

                    System.out.println("Ingrese un segundo precio de producto:");
                    double precio2 = scanner.nextDouble();

                    double totalBruto = precio1 + precio2;
                    double impuesto = totalBruto * 0.19;
                    double totalNeto = totalBruto + impuesto;

                    String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                    + ", con un impuesto de " + impuesto
                    + " y el monto despues de impuesto es de " + totalNeto;*/
