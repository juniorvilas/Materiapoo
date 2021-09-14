package CheckpointI;
//CLASSE DE VETERINARIO DE PETS GRANDES QUE HERDA DE VETERINARIO
public class VetGrande extends Veterinario{
    private int bonus = 1000;
    //CONSTRUTOR SUPER
    public VetGrande(String nome, String sobrenome, String cpf, String endereco, String matricula, double salario, String crmv) {
        super(nome, sobrenome, cpf, endereco, matricula, salario, crmv);
    }
    //SOBSCRIÇÃO DO MÉTODO PAGAMENTO QUE HERDA DE FUNCIONÁRIO
    @Override
    public void pagamento() {
        this.setSalario(getSalario() + getComissao() + this.bonus);
    }
    //SOBSCRIÇÃO DO MÉTODO CONSULTARANIMAL QUE HERDA DE VETERINARIO
    @Override
    public void consultarAnimal(String animal) {
        setComissao(200);
        System.out.println( animal + " consultado!");
        System.out.println("Adicionado 200 reais de comissão");
    }
    //GETTERS E SETTERS
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
