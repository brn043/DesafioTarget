public class Desafio1 {
    public static void main(String[] args) {
        /*Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
        Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
        Imprimir(SOMA);
        Ao final do processamento, qual será o valor da variável SOMA?*/

        int indice = 13;
        int soma = 0 , k = 0;

        while(k < indice){
            k++;
            soma += k;
        }
        System.out.println("Valor final: " + soma);
    }
}
