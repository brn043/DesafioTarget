import java.util.ArrayList;

public class Desafio3 {
    public static void main(String[] args) {
        /* Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
•       O menor valor de faturamento ocorrido em um dia do mês;
•       O maior valor de faturamento ocorrido em um dia do mês;
•       Número de dias no mês em que o valor de faturamento diário foi superior à média mensal. */

        ArrayList faturamentos = new ArrayList();
        faturamentos.add(22174.1664);
        faturamentos.add(24537.6698);
        faturamentos.add(26139.6134);
        faturamentos.add(0.0);
        faturamentos.add(0.0);
        faturamentos.add(26742.6612);
        faturamentos.add(0.0);
        faturamentos.add(42889.2258);
        faturamentos.add(46251.174);
        faturamentos.add(11191.4722);
        faturamentos.add(0.0);
        faturamentos.add(0.0);
        faturamentos.add(3847.4823);
        faturamentos.add(373.7838);
        faturamentos.add(2659.7563);
        faturamentos.add(48924.2448);
        faturamentos.add(18419.2614);
        faturamentos.add(0.0);
        faturamentos.add(0.0);
        faturamentos.add(35240.1826);
        faturamentos.add(43829.1667);
        faturamentos.add(18235.6852);
        faturamentos.add(4355.0662);
        faturamentos.add(13327.1025);
        faturamentos.add(0.0);
        faturamentos.add(0.0);
        faturamentos.add(25681.8318);
        faturamentos.add(1718.1221);
        faturamentos.add(13220.495);
        faturamentos.add(8414.61);

        double maior = 0, menor = 0, media = 0;

        for(int i = 0; i < faturamentos.size(); i++){
            if(i == 0){
                maior = (double) faturamentos.get(i);
                menor = (double) faturamentos.get(i);
            }else{
                if(maior < (double) faturamentos.get(i)){
                    maior = (double) faturamentos.get(i);
                }
                if(menor > (double) faturamentos.get(i)){
                    menor = (double) faturamentos.get(i);
                }
            }

            media += (double) faturamentos.get(i);
        }

        int diasFaturados = 0;
        for(int i = 0; i < faturamentos.size(); i++){
            if(0 != (double) faturamentos.get(i)){
                diasFaturados++;
            }
        }

        media = media/diasFaturados;

        int diasSuperior = 0;
        for(int i = 0; i < faturamentos.size(); i++){
            if(media < (double) faturamentos.get(i)){
                diasSuperior++;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maior);
        System.out.println("A media de faturamento do mês: " + media);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasSuperior);
    }
}
