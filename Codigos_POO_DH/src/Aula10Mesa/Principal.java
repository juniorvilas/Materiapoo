package Aula10Mesa;

public class Principal {
    public static void main(String[] args) {
        Nave nave = new Nave(10,10, 'n',50,2);
        Asteroide asteroide = new Asteroide(5,5,'s',1);
        System.out.println("Posição Nave x:" + nave.getPosx());
        System.out.println("Posição Nave y:" + nave.getPosy());
        nave.irA(15,30,'s');
        System.out.println("Nova Posição Nave x:" + nave.getPosx());
        System.out.println("Nova Posição Nave y:" + nave.getPosy());

        System.out.println("Nova Posição Asteroide x: " + asteroide.getPosx());
        System.out.println("Nova Posição Asteroide y:" + asteroide.getPosy());
        asteroide.irA(15,30,'o');
        System.out.println("Nova Posição Asteroide x:" + asteroide.getPosx());
        System.out.println("Nova Posição Asteroide y:" + asteroide.getPosy());

        if(nave.getPosy() == asteroide.getPosy() && nave.getPosx() == nave.getPosx()){
            System.out.println("BOOOOMMM");
            nave.setVida(asteroide.getDanos());
            System.out.println("Vidas restantes da nave: " + nave.restaVida());
        } else {
            System.out.println("Elementos não estão na mesma posição");
        }
    }
}
