package estagio_ribeirao_preto;/*
    1) Observe o trecho de código abaixo:
 */


public class Soma {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("estagio_ribeirao_preto.Soma: " + soma);
    }
}
