package CheckpointI;
//CLASSE ABSTRATA DE VETERINARIO QUE HERDA DE FUNCIONARIO
public abstract class Veterinario extends Funcionario{
    private String crmv;
    //MÉTODO CONSTRUTOR SUPER
    public Veterinario(String nome, String sobrenome, String cpf, String endereco, String matricula, double salario, String crmv) {
        super(nome, sobrenome, cpf, endereco, matricula, salario);
        this.crmv = crmv;
    }
    //MÉTODO ABSTRATO DE CONSULTA DO ANIMAL
    public abstract void consultarAnimal(String animal);
}
