package Aula16;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao","Silva","15184848",100);
        try{
            cliente.comprar(110);
        } catch (ClientesException e) {
            //e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString()); //Com err a msg sai em cor vermelha
        }
    }
}
