public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args){

        String a = "a";
        String b = "b";
        String c = a;


        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //concat()demoro 500 => 2ms, 1000 => 4ms, 10000 => 85ms, 100000 => 5241ms
            //c += a + b + "\n";                      //operador + ,demoro 500 => 13ms, 1000 => 15ms, 10000 => 53ms, 100000 => 1865ms
            sb.append(a).append(b).append("\n");      //StringBuilder demoro 500 => 0ms, 1000 => 0 ms, 10000 => 2ms, 100000 => 8ms

        }

        long   fin  = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
