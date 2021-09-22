package Aula19;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private List<Empregado> listaEmpregados = new ArrayList<>();

    public Empresa(String cnpj) {

        this.cnpj = cnpj;
    }


    public void addEmpregado(Empregado empregado){

        listaEmpregados.add(empregado);
    }

    public Double calcularSalarioTotal(){
        double salarioTotal = 0.0;
        for(Empregado empregado : listaEmpregados){
            salarioTotal += empregado.calcularSalario();
        }
        return salarioTotal;
    }
}
