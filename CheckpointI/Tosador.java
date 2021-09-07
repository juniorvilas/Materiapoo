package CheckpointI;
//CLASSE TOSADOR QUE HERDA DE FUNCIONARIO
public class Tosador extends Funcionario{
    //MÉTODO CONSTRUTOR SUPER DO TOSADOR
    public Tosador(String nome, String sobrenome, String cpf, String endereco, String matricula, double salario) {
        super(nome, sobrenome, cpf, endereco, matricula, salario);
    }
    //SOBSCRIÇÃO DO MÉTODO ABSTRATO DE PAGAMENTO DA CLASSE FUNCIONARIO
    @Override
    public void pagamento() {
        this.setSalario(getSalario() + getComissao());
    }
    //MÉTODO TOSAR PET PEQUENO, O MÉTODO ADICIONA 20 REAIS DE COMISSÃO A CADA TOSA
    public void tosarPequeno(String animal) {
        setComissao(20);
        System.out.println(animal + " tosado!");
        System.out.println("Adicionado 20 reais de comissão");
    }
}
