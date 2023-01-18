package aula_metodos;

import pacote1.ClassePacote1;

public class TestaMetodos {

    public static void main(String[] args) {

    metodoPublico();
    metodoFriendly();
    metdoProtegido();
    metodoPrivado();

    Classe1.metodoFriendly();
    Classe1.metodoPublico();
    Classe1.metdoProtegido();

    ClassePacote1.metodoPublico();

    }

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
}
