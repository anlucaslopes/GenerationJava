package ATIVIDADE1;

import java.util.Scanner;

public class ATIVIDADE1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float salario, abono, novoSalario;

        System.out.print("Digite o salario: ");
        salario = scanner.nextFloat();
        System.out.print("Digite o abono: ");
        abono = scanner.nextFloat();

        novoSalario = salario + abono;
        System.out.printf("Novo Sálario: %.2f", novoSalario);


    }




}
