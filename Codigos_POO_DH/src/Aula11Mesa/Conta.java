package Aula11Mesa;



public abstract class Conta {
    private Clientes numCliente;
    public void setClienteAssociado(Clientes clienteAssociado) {
        this.numCliente = clienteAssociado;
    }

    public Conta(Clientes clienteAssociado) {
        this.numCliente = clienteAssociado;
    }

    public Clientes getClienteAssociado() {
        return numCliente;
    }
    public abstract String depositar();
    public abstract String sacar();
    public abstract String mostrarSaldo();
}
