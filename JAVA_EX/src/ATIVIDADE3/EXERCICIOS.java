package ATIVIDADE3;

import java.util.Scanner;

public class EXERCICIOS {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero do intervalo: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero do intervalo: ");
        num2 = scan.nextInt();

        if(num1 < num2){
            for(int contador = num1; contador <=num2; contador++){
                if(num1 % 3 == 0 && num1 % 5 == 0) {
                    System.out.println(num1 + "é múltiplo de 3 e 5 ");
                }
                num1++;
            }
        } else {
            System.out.println("Intervalo inválido!");
        }

        //             ATIVIDADE 2

        /*

        int idade = 0, menores21 = 0, maiores50 = 0;
        Scanner scan = new Scanner(System.in);

        while(idade >= 0) {
            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();

            if (idade < 21 && idade > 0) {
                menores21++;
            }

            if (idade > 50) {
                maiores50++;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

         */

        //          ATIVIDADE 3

        /*

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

         */
    }
}
