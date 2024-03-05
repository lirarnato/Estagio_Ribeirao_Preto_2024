/*
2) Dado a sequencia de fibonacci, onde se inicia por 0 e 1 e o
proximo valor sempre sera a soma dos 2 valores anteriores
(exemplo: 0, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa
em java onde, informado um numero, ele calcule a sequencia de
fibonacci e retorne uma mensagem avisando se o numero informado
pertence ou não a sequencia.
 */
package estagio_ribeirao_preto;

import java.util.Scanner;

public class VerificarSequenciaFibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        int numero = entrada.nextInt();
        entrada.close();

        if(pertenceFibonacci(numero)){
            System.out.println(numero + " pertence a sequencia!!!");
        }else {
            System.out.println(numero + " não pertence a sequencia!!!!");
        }
    }

    public static boolean pertenceFibonacci(int numero){
        int a = 0;
        int b = 1;

        while(b <= numero){
            if(b == numero){
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}
