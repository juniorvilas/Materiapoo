import java.util.Scanner;

public class AtvProf {


    public static int quantosPacotes(float quant, Scanner entrada){

        float kilo = 0.0f;
        int cont = 0;
        while (kilo < quant) {
            System.out.println("Digite o peso do pacote:");
            String entradaAux = entrada.nextLine();
            float aux = Float.parseFloat(entradaAux);

            kilo = kilo + aux;
            cont = cont + 1 ;

        }

        return cont;
    }

    public static void main(String[] args) {

        //Scanner é uma classe própria do Java que nos permite inserir valores.
        // Possui métodos e funções já programadas,
        // que nos permitem inserir diferentes tipos de dados.

        Scanner entrada = new Scanner(System.in); // damos o nome do Scanner de entrada
        System.out.println("Digite o nome do cachorro:"); // imprime no console a mensagem no parenteses
        String nome = entrada.nextLine(); // Informamos nome como String e passamos o metodo Scanner pra receber algum dado

        System.out.println("Digite a quantidade de ração:");
        String quantAux = entrada.nextLine();
        float quant = Float.parseFloat(quantAux); // convertendo String para float


        System.out.println("Você precisa de " + quantosPacotes(quant, entrada) + " pacotes");




    }
}
