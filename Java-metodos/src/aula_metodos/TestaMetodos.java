package aula_metodos;

import Gato.Gato;
import pacote1.ClassePacote1;

import java.util.Scanner;

public class TestaMetodos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Gato gat = new Gato();



        gat.setNome("Petruchio");
        gat.setRaca("Somali");

        System.out.println("Escreva o nome do gato:  ");
        System.out.println("nome: " + gat.getNome());
        System.out.println("Escreva o nome da raca do gato: ");
        System.out.println("Nome: " + gat.getRaca());









        /*
        metodoPublico();
        metodoFriendly();
        metdoProtegido();
        metodoPrivado();

        Classe1.metodoFriendly();
        Classe1.metodoPublico();
        Classe1.metdoProtegido();

        ClassePacote1.metodoPublico();


       */
    }

    /*

    //Método Public
    public static void metodoPublico(){
        System.out.println("Método Publico - Classes Testa Metodos");
    }

    //Método Friendly
    static void metodoFriendly(){
        System.out.println("Método Friendly - Classe Testa Métodos");
    }

    //Método Protected
    protected static void metdoProtegido(){
        System.out.println("Método Protegido - Classe Testa Métodos");
    }

    //Método Private
    private static void metodoPrivado(){
        System.out.println("Método Privado - Classe Testa Métodos");
    }
   */

}
