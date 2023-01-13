package ATIVIDADE3;

import java.util.Scanner;

public class Exercicio01 {
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

    }
}
