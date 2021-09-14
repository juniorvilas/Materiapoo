package Aula14Mesa;

public class Principal {

    public static void main(String[] args) {

        Porto portoSantos = new Porto("portoSantos");

        Container container1 = new Container(1, false, "China");
        Container container2 = new Container(2, true, "EUA");
        Container container3 = new Container(3, false, "Brasil");
        Container container4 = new Container(4, true, "Rússia");
        Container container5 = new Container(5, false, "Canadá");
        Container container6 = new Container(6, true, "Desconhecido");

        portoSantos.adicionarContainer(container1);
//        portoSantos.ordenar();
        portoSantos.adicionarContainer(container5);
        portoSantos.adicionarContainer(container2);
        portoSantos.adicionarContainer(container3);
//        portoSantos.ordenar();
        portoSantos.adicionarContainer(container6);
        portoSantos.adicionarContainer(container4);

        System.out.println("Conteiners Ordenados pelo número:");
        portoSantos.ordenar();
        System.out.println();
        System.out.println("Quantidade de Containers perigosos de Origem Desconhecida: " + portoSantos.quantidadePerigoso());


    }
}
