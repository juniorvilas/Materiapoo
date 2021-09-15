package Aula16Mesa;

import java.util.Date;


public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) {
        Date hoje= new Date(2021,9,15);
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.before(hoje))
            this.dataInternacao=dataInternacao;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacientesException {
        if(dataAlta.after(dataInternacao))
            System.out.println(" Paciente Liberado!");
        else
            throw new PacientesException(" Paciente não pode ser liberado!");


    }



}
