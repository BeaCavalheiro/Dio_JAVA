public class Operadores {
    public static void main(String[] args) throws Exception {
        int num = 5; // num inicialmente é atribuido positivo
        System.out.println(num);// =5

        num = -num; // num recebe ele mesmo da forma negativa
        System.out.println(num); // =-5

        num = -num; // para positivar é preciso multiplicar por -1 ou atribuir negatividade ao
                    // numero negativo afinal - com - = +
        System.out.println(num);// =5
    }

    public void Incremento(int num) {
        num++; // primeiro imprime depois soma
        ++num; // primeiro soma depois imprime
    }

    public void Decremento(int num) {
        --num; // primeiro decrementa depois imprimi
        num--; // primeiro imprimi depois decrementa

    }
    public void Ternario(int num) {
       int a,b;
       a=1;
       b=2;
       

    }
    
}
