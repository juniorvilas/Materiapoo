package Aula21;

public class Main {
    public static void main(String[] args) {
        Reparo liquidificador = new Reparo("Liquidificador",15,"Rua praia");
        liquidificador.setEstado(new Reparacao(liquidificador));
        System.out.println(liquidificador.toString());
        //liquidificador.getEstado().addItensExtra(10, "peça");








    }
}
