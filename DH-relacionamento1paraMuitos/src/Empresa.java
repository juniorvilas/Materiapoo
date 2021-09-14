import java.util.*;

public class Empresa {
    private String cnpj;

    private List<Empregado> empregados = new ArrayList<>();

    public void addEmpregado(Empregado empregado){
        empregados.add(empregado);
    }

    public int quantidadEmpregados()
    {
        return empregados.size();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void mostrarEmpregados(){
        for(Empregado empregado : empregados)
            System.out.println(empregado.getNome());
    }

    public void mostrarEmpregadosOrdenadosPorIdade()
    {
        empregados.sort(null);
        mostrarEmpregados();
    }
}