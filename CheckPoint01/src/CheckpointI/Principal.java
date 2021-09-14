package CheckpointI;

public class Principal {
    public static void main(String[] args) {
        ClinicaVet petz = new ClinicaVet("Petz","73621");

        //CHAMADA DOS MÉTODOS & INSTANCIAÇÃO DO TOSADOR
        Funcionario tosador = new Tosador("caio","castro","8273621","rua praia","123",1500);
        petz.cadastrar(tosador);
        ((Tosador)tosador).tosarPequeno("gato");
        tosador.pagamento();
        System.out.println(tosador.toString());

        System.out.println(" ");
        //CHAMADA DOS MÉTODOS & INSTANCIAÇÃO DO VETERINARIO DE AVES
        Funcionario vetAv = new VetAves("maria","passaro","826361","rua urubu","3261",2500,"182");
        petz.cadastrar(vetAv);
        ((VetAves)vetAv).consultarAnimal("papagaio");
        vetAv.pagamento();
        System.out.println("Bonus: " + ((VetAves) vetAv).getBonus());
        System.out.println(vetAv.toString());

        System.out.println(" ");
        //CHAMADA DOS MÉTODOS & INSTANCIAÇÃO DO VETERINARIO DE PETS PEQUENOS
        Funcionario vetPeq = new VetPequeno("carlindo","junior","127382","rua joao","1234",3000,"987");
        petz.cadastrar(vetPeq);
        ((VetPequeno)vetPeq).consultarAnimal("cachorro");
        vetPeq.pagamento();
        System.out.println("Bonus: " + ((VetPequeno) vetPeq).getBonus());
        System.out.println(vetPeq.toString());

        System.out.println(" ");
        //CHAMADA DOS MÉTODOS & INSTANCIAÇÃO DO VETERINARIO DE PETS GRANDES
        Funcionario vetGran = new VetGrande("joao","pinto","122382","rua pinto","6969",5000,"#*01");
        petz.cadastrar(vetGran);
        ((VetGrande)vetGran).consultarAnimal("cavalo");
        vetGran.pagamento();
        System.out.println("Bonus: " + ((VetGrande) vetGran).getBonus());
        System.out.println(vetGran.toString());
        //LISTANDO TODOS OS FUNCIONÁRIOS
        System.out.println(" ");
        System.out.println("------------------------ LISTA DE FUNCIONARIOS ------------------------");
        petz.listarFuncionarios();
    }
}
