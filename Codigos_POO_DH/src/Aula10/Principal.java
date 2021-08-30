package Aula10;

public class Principal {
    public static void main(String[] args) {

        Associado associado = new Associado("123", "Junior",100, "Academia");
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("333", "John","Tenis",100,50);
        associadoHabilitado.setHabilitado(true);
        System.out.println(associadoHabilitado.custoMensal());

    }
}
