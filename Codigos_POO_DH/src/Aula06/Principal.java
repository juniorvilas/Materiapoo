package Aula06;


import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Impressora impressora = new Impressora("Epson","wifi", LocalDate.of(2021,8,20));
        System.out.println(impressora.getDataFabricacao());
        System.out.println(impressora.getModelo());
        System.out.println(impressora.getTipoConexao());
        System.out.println(impressora.getFolhasDisponiveis());
        impressora.setFolhasDisponiveis(10);
        impressora.imprimir("teste");
        System.out.println(impressora.getFolhasDisponiveis());
    }
}
