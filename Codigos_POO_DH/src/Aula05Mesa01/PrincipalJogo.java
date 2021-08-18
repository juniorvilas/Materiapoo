package Aula05Mesa01;

public class PrincipalJogo {
    public static void main(String[] args) {

        UsuarioJogo usuarioJogo = new UsuarioJogo("Junior","JR");

        System.out.println(usuarioJogo.getNome());
        System.out.println(usuarioJogo.getNickname());
        System.out.println(usuarioJogo.getPontuacao());
        System.out.println(usuarioJogo.getNivel());
        System.out.println(usuarioJogo.aumentarPontuacao(100));
        System.out.println(usuarioJogo.bonus());
        System.out.println(usuarioJogo.subirNivel());
        System.out.println(usuarioJogo.subirNivel());

    }
}
