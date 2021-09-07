package Aula11;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Impressora impressora = new ImpressoraEpson("123","USB", LocalDate.of(2021,9,01),1,10);
        System.out.println(impressora.toString());

    }

}
