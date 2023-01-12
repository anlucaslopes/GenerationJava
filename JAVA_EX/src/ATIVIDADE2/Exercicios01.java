package ATIVIDADE2;

import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args){
        int a, b, c, soma;
        Scanner read = new Scanner((System.in));

        System.out.print("Digite o numero A: ");
        a = read.nextInt();
        System.out.print("Digite o numero B: ");
        b = read.nextInt();
        System.out.print("Digite o numero C: ");
        c = read.nextInt();

        soma = a + b;

        if(soma > c) {
            System.out.println("A soma de A + B é Maior do que C");
        } else if (soma < c) {
            System.out.println("A soma de A + B é Menor do que C");
        } else {
            System.out.println("A soma de A + B é igual a C");
        }
    }
}
