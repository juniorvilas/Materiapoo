package Aula05;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(2,"Junior");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getDivida());
        cliente.aumentarDivida(500); //acrescenta mais 500 na divida
        System.out.println(cliente.getDivida());
        cliente.setNome("JR"); //altera o nome
        System.out.println(cliente.getNome());
        cliente.aumentarDivida(500); //acrescenta mais 500 na divida
        System.out.println(cliente.getDivida());
        cliente.pagarDivida();//zera a divida
        System.out.println(cliente.getDivida());


    }
}
