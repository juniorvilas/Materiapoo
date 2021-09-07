package CheckpointI;
//CLASSE DE VETERINARIO ESPECIALISTA EM AVES QUE HERDA DE VETERINARIO
public class VetAves extends Veterinario{
    private int bonus = 250;
    //MÉTODO CONSTRUTOR SUPER
    public VetAves(String nome, String sobrenome, String cpf, String endereco, String matricula, double salario, String crmv) {
        super(nome, sobrenome, cpf, endereco, matricula, salario, crmv);
    }
    //SOBSCRIÇÃO DO MÉTODO ABSTRATO DE PAGAMENTO DA CLASSE FUNCIONARIO
    @Override
    public void pagamento() {
        this.setSalario(getSalario() + getComissao() + this.bonus);
    }
    //SOBSCRIÇÃO DO MÉTODO ABSTRATO CONSULTAR ANIMAL DA CLASSE VETERINARIO
    @Override
    public void consultarAnimal(String animal) {
        setComissao(100);
        System.out.println( animal + " consultado!");
        System.out.println("Adicionado 100 reais de comissão");
    }
    //GETTERS E SETTERS
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
