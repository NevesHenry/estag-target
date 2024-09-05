public class Main {
    public static void main(String[] args) {


        System.out.println("Q1:");
        System.out.print("The result is: " );
        Q1();
    }

    public static void Q1() {
        int INDICE = 13, SOMA = 0, K = 0;
        while( K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA);
    }

}