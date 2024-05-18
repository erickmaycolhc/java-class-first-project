public class PasarPorValor {
    public static void main(String[] args){
        Integer i = 10;
        System.out.println("Iniciamos el método main con i => " + i);
        test(i);
        System.out.println("Finalizamos el método main con i (Se mantiene igual) => " + i);
    }

    public static void test(Integer i){
        System.out.println("Iniciamos el método test con 1 => " + i);
        i = 35;
        System.out.println("Finalizamos el método test con i => " + i);
    }


}
