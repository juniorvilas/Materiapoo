package Aula19;

public class EmpregadoFactory {

    private static EmpregadoFactory instance;

    private EmpregadoFactory(){}

    public static EmpregadoFactory getInstance() {
        if(instance == null)
            instance = new EmpregadoFactory();
        return instance;
    }

    public Empregado criarEmpregado(String tipo) {
        if (tipo.equals("R")){
            return new EmpregadoRelacaoDep();
        }else if (tipo.equals("C")) {
            return new EmpregadoContratado();
        }
        return null;
    }

}
