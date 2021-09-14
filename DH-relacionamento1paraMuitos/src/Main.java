import java.util.*;
public class Main {

    public static void main(String[] args) {


        /* Criamos um funcionário chamado Rodolfo que começou a trabalhar em 2 de maio de 1989 */
        Empregado empregado1 = new Empregado();
        empregado1.setNome("Rodolfo");
        empregado1.setIdade(33);
        empregado1.setDataContratacao(new Date(89,5,2));

        /* Criamos um funcionário chamado Nicolas que começou a trabalhar em 2 de maio de 1990 */
        Empregado empregado2 = new Empregado();
        empregado2.setNome("Nicolas");
        empregado2.setIdade(28);
        empregado2.setDataContratacao(new Date(90,5,2));

       /* Criamos um funcionário chamado Javier que começou a trabalhar em 2 de maio de 1995 */
        Empregado empregado3 = new Empregado();
        empregado3.setNome("Javier");
        empregado3.setIdade(39);
        empregado3.setDataContratacao(new Date(95,5,2));


        /*Criamos um objeto Empresa e adcionamos os empregados*/
        Empresa digitalHouse = new Empresa();
        digitalHouse.setCnpj("Digital House S.A.");
        digitalHouse.addEmpregado(empregado1);
        digitalHouse.addEmpregado(empregado2);
        digitalHouse.addEmpregado(empregado3);

        System.out.println("Mostramos os empregados adicionados a Digital House: ");
        digitalHouse.mostrarEmpregados();

        System.out.println("Mostramos os empregados adicionados  a Digital House ordenados por idade: ");
        digitalHouse.mostrarEmpregadosOrdenadosPorIdade();

    }
}