package Mesas;

import java.util.Scanner;

        public class main {


            public static void main(String args []) {
                // Faça um programa que permita jogar o jogo Pedra-Papel-Tesoura; .

                int jogador1Escolha = 0;
                int jogador2Escolha = 0;
                int pontuacaoJogador1 = 0;
                int pontuacaoJogador2 = 0;

                // 1 - Primeiro, o aplicativo solicita o nome de cada jogador:
                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite o nome do jogador 1");
                String jogador1 = entrada.nextLine();
                System.out.println("Digite o nome do jogador 2");
                String jogador2 = entrada.nextLine();


                while (jogador1Escolha != 9 || jogador2Escolha != 9) {

                // que retorna 0 em caso de empate, 1 se o primeiro vencer, 2 se o segundo vencer.
                // O jogo termina quando o primeiro escolhe como indicador de fim "*".




                //2- em seguida, qual a opção esse jogador escolhe para jogar: pedra, papel ou tesoura.
                System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
                System.out.println("Pedra = 0 ");
                System.out.println("Papel = 1  ");
                System.out.println("Tesoura = 2");
                System.out.println("Jogador 1 escolhe: ");
                jogador1Escolha = entrada.nextInt();
                System.out.println("Jogador 2 escolhe: ");
                jogador2Escolha = entrada.nextInt();

                // O jogo consiste em perguntar qual opção cada um escolhe e somar pontos ao vencedor —se houver—.





                    switch (jogador1Escolha){
                        case 0:
                            switch (jogador2Escolha){
                                case 0:
                                    System.out.println("Empate");
                                    break;
                                case 1:
                                    System.out.println("Jogador 2 ganhou");
                                    pontuacaoJogador2++;
                                    break;
                                case 2:
                                    System.out.println("Jogador 1 ganhou");
                                    pontuacaoJogador1++;
                                    break;
                                default:
                                    System.out.println ("Número invalido tente novamente!");
                            } break;
                        case 1:
                            switch(jogador2Escolha) {
                                case 0:
                                    System.out.println("Jogador 1 ganhou");
                                    pontuacaoJogador1++;
                                    break;
                                case 1:
                                    System.out.println(" Empatou");
                                    break;
                                case 2:
                                    System.out.println("Jogador 2 ganhou");
                                    pontuacaoJogador2++;
                                    break;
                                default:
                                    System.out.println ("Número invalido tente novamente!");
                            } break;
                        case 2:
                            switch(jogador2Escolha) {
                                case 0:
                                    System.out.println("Jogador 2 ganhou");
                                    pontuacaoJogador2++;
                                    break;
                                case 1:
                                    System.out.println("Jogador 1 ganhou");
                                    pontuacaoJogador1++;
                                    break;
                                case 2:
                                    System.out.println("Empate");
                                    break;
                                default:
                                    System.out.println ("Número invalido tente novamente!");
                            } break;
                        default:
                            System.out.println ("Número invalido tente novamente!");
                    }

                }
                if (jogador1Escolha == 9 || jogador2Escolha == 9) {
                    System.out.println("Jogo acabou");
                    System.out.println(jogador1 + " : "  + pontuacaoJogador1 + " x " + jogador2 + " : " + pontuacaoJogador2);
                }




            }

            // Defina e use uma função chamada whichWin com dois parâmetros
            // com as jogadas de cada um dos jogadores,
            //public static void whichWin() {}

        }




