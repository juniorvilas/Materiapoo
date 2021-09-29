package Compras;

public class Bitcoin implements StrategyPago {
    private String carteira;

    public Bitcoin(String carteira) {
        this.carteira = carteira;
    }

    public void pago() {
        System.out.println("pago com bitcoin");
        System.out.println(carteira);;
    }
}