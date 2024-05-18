public class OperadorInstanceoOf {
    public static void main(String[] args){

        String  text = new String("Dormir es bueno pero también malo");

        Integer num = 2; // Integer nos permite convertir un tipo básico int en un objeto

        Boolean b1 = text instanceof String;
        System.out.println("Texto es del tipo String => " + b1);

        b1 = text instanceof String;
        System.out.println("Texto es del tipo Object => " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer => " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number => " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object => " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("num es del tipo Number => " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean => " + b1);

    }
}
