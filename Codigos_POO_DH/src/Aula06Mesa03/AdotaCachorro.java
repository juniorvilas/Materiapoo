package Aula06Mesa03;

import java.time.LocalDate;

public class AdotaCachorro {


    private String nome;
    private String raca;
    private int anoNascimento;
    private double peso;
    private boolean chip;
    private boolean ferido;

    //CONSTRUTORA
    public AdotaCachorro(String nome, String raca, int anoNascimento, double peso, boolean chip, boolean ferido) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
    }
    //SETS GETS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    //FUNÇÕES
    public int qualIdade(int anoAtual) {
        int idade = anoAtual - this.anoNascimento;
        return idade;
    }

    public String validarChip() {
        if (chip == true)
            return "Tem Chip";
        else
            return "Não tem chip";
    }

    public String aptoParaAdocao() {
        return !ferido && peso >  5 ? "Apto para Adoção" : "Não apto para Adoção";



    }

}
