package Aula15Mesa;

public class Principal {
    public static void main(String[] args) {

        Iates iate1 = new Iates(15000,5000,2021,30,5);
        Iates iate2 = new Iates(20000,8000,2019,40,10);
        Veleiros veleiro1 = new Veleiros(5000,1000,2019,10,5);
        Capitao gancho = new Capitao("Gancho","Jeck","12345");
        System.out.println("Alugul iate1: " + iate1.aluguel());
        System.out.println("");
        iate1.eLuxuoso(iate2);
        System.out.println("");
        veleiro1.eGrande();
        System.out.println("");
        System.out.println(gancho);



    }
}
