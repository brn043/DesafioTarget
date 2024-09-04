import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        /* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
        (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
        ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        */

        Scanner r = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = r.nextInt();

        ArrayList fibonacci = new ArrayList();
        int a = 0, b = 1;
        fibonacci.add(a);
        fibonacci.add(b);

        while (b < n) {
            int aux = a + b;
            a = b;
            b = aux;
            fibonacci.add(b);
        }

        if(fibonacci.contains(n)){
            System.out.println("O número " + n + " pertence á sequência de fibonacci!");
        }else{
            System.out.println("O número " + n + " não pertence á sequência de fibonacci!");
        }

        System.out.println("Sequência de Fibonacci até " + n + " :" + fibonacci);

        r.close();
    }
}
