package ATIVIDADE1;

import java.util.Scanner;

public class ATIVIDADE_GERAL {
    public static void main(String[] args) {

        /*
        ============================================================
                            ATIVIDADE 1
        ============================================================

         */

        Scanner scanner = new Scanner(System.in);
        float salario, abono, novoSalario;

        System.out.print("Digite o salario: ");
        salario = scanner.nextFloat();
        System.out.print("Digite o abono: ");
        abono = scanner.nextFloat();

        novoSalario = salario + abono;
        System.out.printf("Novo Sálario: %.2f", novoSalario);

        /*
        ============================================================

                        ATIVIDADE 2
         ======================================================

         */

        /*
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Nota 1: ");
        nota1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = scanner.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = scanner.nextFloat();
        System.out.print("Nota 4: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Media final: %.1f", media);


         */

        /*
        ==============================================
                    ATIVIDADE 3
        ==============================================

         */


        /*

        float salarioBruto, adicionaNoturno, horasExtras, descontos, salarioLiquido;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sálario Bruto: ");
        salarioBruto = scanner.nextFloat();
        System.out.print("Adicional Noturno: ");
        adicionaNoturno = scanner.nextFloat();
        System.out.print("Hora Extras: ");
        horasExtras = scanner.nextFloat();
        System.out.print("Descontos: ");
        descontos = scanner.nextFloat();

        salarioLiquido = salarioBruto + adicionaNoturno + (horasExtras * 5) - descontos;
        System.out.printf("Salario Liquido: %.2f", salarioLiquido);

         */

        /*
        ==========================================
                    ATIVIDADE 4
        =========================================
         */


        /*

        float num1, num2, num3, num4, diferenca;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num1 = scanner.nextFloat();
        System.out.print("Numero 2: ");
        num2 = scanner.nextFloat();
        System.out.print("Numero 3: ");
        num3 = scanner.nextFloat();
        System.out.print("Numero 4: ");
        num4 = scanner.nextFloat();

        diferenca = (num1 * num2) - (num3 * num4);
        System.out.printf("Diferenca: %.1f", diferenca);

         */


    }
}
