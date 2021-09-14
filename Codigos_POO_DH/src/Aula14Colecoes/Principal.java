package Aula14Colecoes;

public class Principal {
    public static void main(String[] args) {

        Jogador nelson = new Jogador("Nelson", 1, true, true);
        Jogador joao = new Jogador("Joao", 3, true, true);
        Jogador pedro = new Jogador("Pedro", 2, true, true);
        Equipe turma03 = new Equipe("Turma03");

        turma03.addJogador(nelson);
        turma03.addJogador(joao);
        turma03.addJogador(pedro);
        turma03.mostrarJogadoresTitulares();
        //System.out.println(turma03.getQuantidadeJogadoresLesionados());

    }
}
