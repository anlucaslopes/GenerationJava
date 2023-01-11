package ATIVIDADE1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
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
    }
}
