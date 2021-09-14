package CheckpointI;
//CLASSE DE VETERINARIO ESPECIALISTA EM PET PEQUENO QUE HERDA DE VETERINARIO
public class VetPequeno extends Veterinario{
    private int bonus = 500;
    //MÉTODO CONSTRUTOR SUPER
    public VetPequeno(String nome, String sobrenome, String cpf, String endereco, String matricula, double salario, String crmv) {
        super(nome, sobrenome, cpf, endereco, matricula, salario, crmv);
    }
    //SOBSCRIÇÃO DO MÉTODO DE PAGAMENTO JUNTO COM A SOMA DO BONUS
    @Override
    public void pagamento() {
        this.setSalario(getSalario() + getComissao() + this.bonus);
    }
    //MÉTODO PARA CONSULTAR O ANIMAL QUE O VETERINÁRIO FAZ O EXAME E NELE É ADICIONADO A COMISSÃO DE 150R REAIS
    public void consultarAnimal(String animal) {
        setComissao(150);
        System.out.println( animal + " consultado!");
        System.out.println("Adicionado 150 reais de comissão");
    }
    //  GETTERS E SETTERS
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
