package CheckpointI;

import java.util.ArrayList;
// CLASSE CLÍNICA
public class ClinicaVet{
    private String nomeClinica;
    private String cnpj;
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    //CONSTRUTOR
    public ClinicaVet(String nome, String cnpj) {
        this.nomeClinica = nome;
        this.cnpj = cnpj;
    }
    //MÉTODO CADASTRAR FUNCIONARIOS NO ARRAY
    public void cadastrar(Funcionario funcionario) {
        this.listaFuncionarios.add(funcionario);
        System.out.println("Funcionário cadastrado!");
    }
    //MÉTODO PARA RETORNAR OS FUNCIONARIOS CADASTRADOS
    public void listarFuncionarios() {
        for(int  i = 0; i < listaFuncionarios.size(); ++i) {
            System.out.println(listaFuncionarios.get(i));
        }
    }
    //MÉTODO PARA VISUALIZAR A CLINICA
    @Override
    public String toString() {
        return "ClinicaVet{" +
                "nome='" + nomeClinica + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", listaFuncionarios=" + listaFuncionarios +
                '}';
    }
}
