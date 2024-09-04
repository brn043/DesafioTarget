import java.util.ArrayList;
import java.text.DecimalFormat;

public class Desafio4 {
    public static void main(String[] args) {
        /*Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
•       SP – R$67.836,43
•       RJ – R$36.678,66
•       MG – R$29.229,88
•       ES – R$27.165,48
•       Outros – R$19.849,53

        Escreva um programa na linguagem que desejar onde calcule o percentual de representação que
        cada estado teve dentro do valor total mensal da distribuidora. */

        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53, soma = 0;
        ArrayList valores = new ArrayList();

        valores.add(sp);
        valores.add(rj);
        valores.add(mg);
        valores.add(es);
        valores.add(outros);

        for(int i = 0; i < valores.size(); i++){
           soma += (double) valores.get(i);
        }

        DecimalFormat f = new DecimalFormat("0.00");

        System.out.println("O faturamento total foi: " + f.format(soma));
        System.out.println("O faturamento percentual de SP foi: " + f.format(calcularPercentual(soma, sp)) + "%");
        System.out.println("O faturamento percentual de MG foi: " + f.format(calcularPercentual(soma, mg)) + "%");
        System.out.println("O faturamento percentual de ES foi: " + f.format(calcularPercentual(soma, es)) + "%");
        System.out.println("O faturamento percentual dos Outros foi: " + f.format(calcularPercentual(soma, outros)) + "%");
    }

    public static double calcularPercentual(double total, double faturamento){
        return (faturamento / total) * 100;
    }
}
