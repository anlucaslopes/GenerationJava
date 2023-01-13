package ATIVIDADE3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);
        System.out.print("A soma do numeros positivos é: " + soma);
    }
}
