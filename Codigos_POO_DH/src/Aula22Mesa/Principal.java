package Aula22Mesa;

public class Principal {
    public static void main(String[] args) {

        // instanciar as figuras
        Retangulo retangulo01 = new Retangulo(5, 4);
        Circulo circulo01 = new Circulo(1);
        Retangulo retangulo02 = new Retangulo(6, 4);
        Triangulo triangulo = new Triangulo(2, 2);

        // Instanciando os combos vagao e a locomotiva
        Combo vagao = new Combo();
        Combo locomotiva = new Combo();


        // Adicionando as figuras no Combo Vagão
        vagao.addArea(retangulo01);
        vagao.addArea(circulo01);
        vagao.addArea(circulo01);
        vagao.addArea(circulo01);

        // Calculando a área do vagao
        System.out.println(vagao.calcularArea());


        // Adicionando as figuras do Combo Locomotiva
        locomotiva.addArea(retangulo02);
        locomotiva.addArea(circulo01);
        locomotiva.addArea(circulo01);
        locomotiva.addArea(triangulo);

        // Calculando a área do Combo Locomotiva
        System.out.println(locomotiva.calcularArea());

        // Calculando a área total do Trem
        System.out.println("A área total do Trem é : " + (vagao.calcularArea() + locomotiva.calcularArea()));

    }
}
