package Aula06Mesa03;

public class Principal {
    public static void main(String[] args) {

        AdotaCachorro cachorro = new AdotaCachorro("bob","pitbul",2010,10,true,false);
        System.out.println(cachorro.qualIdade(2021));
        System.out.println(cachorro.validarChip());
        System.out.println(cachorro.aptoParaAdocao());
        System.out.println(cachorro.getPeso());

    }
}
