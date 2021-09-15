package Aula16Mesa;
//Grupo: Carlindo, Natalia, Guilherme Procopio,
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("Jose","Pinto","Tomou tiro", new Date(2021,9,14));
        System.out.println(paciente.getDataInternacao());
        try {
            paciente.darAlta(new Date(2021,9,13));
        } catch (PacientesException e) {
            //e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString()); //Com err a msg sai em cor vermelha
        }
    }
}
