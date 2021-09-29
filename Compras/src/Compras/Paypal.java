package Compras;

public class Paypal implements StrategyPago {
    private String email;
    private String senha;

    public Paypal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }



    public void pago() {
        System.out.println("pago com paypal");
        System.out.println(email);
        System.out.println(senha);
    }
}
