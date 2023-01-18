package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        int opcao1, opcao2, num, a, b;
        float num1, num2, resultado;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("Bem vindo a nossa calculadora!!\n");
            System.out.println("Digite um numero 1 ou 2, sendo: \n1 - Operações básicas\n2 - Sair\n");
            num = ler.nextInt();
            if(num == 1){
                System.out.println("Digite um numero para as operacoaes basicas" +
                        "\n1 - soma" +
                        "\n2 - subtração" +
                        "\n3 - Multiplicacao" +
                        "\n4 - Divisão");
                opcao2 = ler.nextInt();
                switch (opcao2){
                    case 1:
                     System.out.println("Digite um 1o numero:");
                     num1 = ler.nextFloat();
                     System.out.println("Digite um 2o numero:");
                     num2 = ler.nextFloat();
//                     operacaoBasica OpBas = new operacaoBasica(num1, num2);
//                     resultado = OpBas.Multiplicador(num1, num2);
                     System.out.println("Numero "+num1+" + "+num2+" = "+resultado);
                    case 2:
                        System.out.println("");
                }
            }
        }while (opcao1 != 2);
    }
}
