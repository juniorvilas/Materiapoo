package Aula23Mesa;

public class Instituto implements Interface{

    private String areaAcademica;
    private String areaComercial;

    public Instituto(String areaAcademica, String areaComercial) {
        this.areaAcademica = areaAcademica;
        this.areaComercial = areaComercial;
    }

    @Override
    public double calcularPreco() {
        return 0;
    }

    public void relatorio(Curso curso) {
        toString();

    }


}
