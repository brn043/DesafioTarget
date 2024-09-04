import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        /* Escreva um programa que inverta os caracteres de um string */

        Scanner r = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String p = r.next();

        String[] inversa = p.split("");

        for(int i = inversa.length - 1; i >= 0; i--){
            System.out.print(inversa[i]);
        }

        r.close();
    }
}
