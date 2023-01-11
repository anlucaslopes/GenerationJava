package ATIVIDADE1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
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
    }
}
