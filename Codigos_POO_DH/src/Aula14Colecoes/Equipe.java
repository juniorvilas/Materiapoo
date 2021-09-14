package Aula14Colecoes;

import java.util.ArrayList;

public class Equipe {

    private String nome;
    private ArrayList<Jogador> listajogadores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador) {
        this.listajogadores.add(jogador);
        System.out.println("Jogador adicionado com sucesso!");
    }


    //O método mostrarJogadoresTitulares() só deve mostrar
    // por console os jogadores que são Titulares e ordenados por número de camisa.

    public void mostrarJogadoresTitulares () {
        listajogadores.sort((jogador1, jogador2) -> jogador1.compareTo(jogador2));
        for(Jogador jogador: listajogadores) {
            if (jogador.isTitular()) {
                System.out.println(jogador.getNome() +" Número da Camisa: "+ jogador.getNumCamisa());
            }
        }
    }


    //O método getQuantidadeJogadoresLesionados()
    // deve ser somado e retornado o número de jogadores
    // que estão lesionados e que são titulares.
    public int getQuantidadeJogadoresLesionados() {
        int contador = 0;
        for(Jogador jogador: listajogadores) {
            if(jogador.isLesionado() && jogador.isTitular()) {
                contador++;
            }
        }
        return contador;
    }

}
