package Atividade01;


public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Andre", "andre@teste.com", "123.123.123-82", 25, "Rua Generation, 19");
        Cliente cliente2 = new Cliente("Bob", "bob@teste.com", "321.321.321-82", 30, "Rua Generation, 25");

        cliente1.visualizar();
        cliente2.visualizar();
    }
}
