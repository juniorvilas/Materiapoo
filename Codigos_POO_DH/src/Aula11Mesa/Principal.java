package Aula11Mesa;

public class Principal {
    public static void main(String[] args) {
        Clientes cliente = new Clientes(1, "Antunes", 3556,"34543");
        Conta conta = new Poupanca(cliente,100, "5");
        conta = new Corrente(100,500,cliente);
        System.out.println(cliente.toString());
    }
}
