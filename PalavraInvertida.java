/*
5) Escreva um programa em java que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada atraves de qualquer entrada de sua
preferencia ou pode ser previamente definida no codigo;

b) Evite usar funcoes prontas, como, por exemplo reverse.

 */
package estagio_ribeirao_preto;

import java.util.Scanner;

public class PalavraInvertida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String input = entrada.nextLine();
        entrada.close();

        String reverso = inverterPalavra(input);
        System.out.println("Palavra invertida: " + reverso);

    }
        public static String inverterPalavra(String real){
            char[] caracteres = real.toCharArray();
            int inicio = 0;
            int fim = caracteres.length - 1;

            while (inicio < fim) {
                char temp = caracteres[inicio];
                caracteres[inicio] = caracteres[fim];
                caracteres[fim] = temp;

                inicio++;
                fim--;
            }
            return new String(caracteres);
        }
    }

