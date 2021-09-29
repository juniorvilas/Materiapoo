package Compras;

public class Compras {
    private StrategyPago formaPago;

    public void pago() {
        formaPago.pago();
    }

    public void setPago(StrategyPago novoPago) {
        formaPago = novoPago;
    }
}
