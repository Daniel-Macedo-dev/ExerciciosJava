package PolimorfismoSobrecarga;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir(true);
        c.reagir(2,12.5f);
    }
}