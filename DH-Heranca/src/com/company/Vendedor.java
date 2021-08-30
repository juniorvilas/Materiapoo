public class Vendedor extends Empregado{
    private int comissao;
    private double totalvendas;


    public Vendedor(String nome, String arquivo) {
        super(nome, arquivo);
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public void setTotalVendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }

    @Override
    public double calcularSalario() {
        return salario + (totalvendas/100*comissao)-desconto;
        /* Otra forma
        return super.calcularSueldo() + importeVentas/100*comision;
         */
    }

    @Override
    public double calcularSalario(double premio) {
        return salario+premio+(totalvendas/100*comissao)-desconto;
        /*Otra forma
            return super.calcularSueldo(premio)+importeVentas/100*comision;
         */
    }
    @Override
    public String toString() {
        return super.toString() +
                " Comissão=" + comissao + " % \n" +
                " Vendas=" + totalvendas;

    }


}
