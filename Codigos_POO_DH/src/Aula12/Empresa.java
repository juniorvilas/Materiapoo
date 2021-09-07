package Aula12;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> listFuncionario = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    public void cadastrar(Funcionario funcionario) {
        this.listFuncionario.add(funcionario);
        System.out.println("Funcionario cadastrado com sucesso!");
    }

    public void listar(){
        for(int i = 0; i < listFuncionario.size(); i++){
            System.out.println(listFuncionario.get(i));
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
