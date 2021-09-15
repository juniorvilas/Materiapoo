package Aula16Mesa;

public class PacientesException extends Exception{

    public PacientesException() {}

    public PacientesException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "A seguinte exceção ocorreu: " + getClass().getName() + " Mensagem: " + getMessage();
    }
}
