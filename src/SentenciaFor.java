public class SentenciaFor {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){
            System.out.println("i => " + i);
        }

        for(int i = 10; i >= 10; i--){
            System.out.println("i => " + i);
        }

        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        for(int k = 0; k <= 10; k++){
            if( !(k % 2 == 0)){
                continue;
            }
            System.out.println("k => " + k);
        }
    }
}
