package Compras;

public class Main {
    public static void main(String[] args) {
        Compras compras = new Compras();

        compras.setPago(new Cartao("Luis Lopez", "223455423323443","123", "02/29"));
        compras.pago();

        compras.setPago(new Bitcoin("ADSDW#FSDS02/29"));
        compras.pago();

        compras.setPago(new Paypal("leandro@dh.com", "minhaSenhaSecreta"));
        compras.pago();


    }
}
