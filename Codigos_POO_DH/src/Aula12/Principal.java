package Aula12;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("DH", "16066888000103");
        Funcionario func1 = new Gerente("Carlindo","Junior","111222",10000);
        Funcionario func2 = new Vendedor("Joao","Silva","123456789",1000,1.05);

        dh.cadastrar(func1);
        dh.cadastrar(func2);

        dh.listar();
        System.out.println(dh);
        func1.pagamento();

    }
}
