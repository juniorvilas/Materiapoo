package Aula23Mesa;

public class Principal {
    public static void main(String[] args) {

        Curso FrontEnd = new Curso("FrontEnd","Html, Css",1000,16);
        Curso BackEnd = new Curso("BackEnd","MySql",900,20);
        Programa FullStack = new Programa();
        System.out.println(FrontEnd.calcularPreco());
        System.out.println(FrontEnd.toString());
        FullStack.addCurso(FrontEnd);
        FullStack.addCurso(BackEnd);
        System.out.println(FullStack.toString());
        System.out.println("Valor do curso FullStack com 20% de desconto R$ " +FullStack.calcularPreco());


    }
}
