package apostila_02;

public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando");
            energia -= 2;
        } else {
            System.out.println(nome + " sem energia para cacar");
        }
    }

    void comer() {
        if (fome >= 1) {
            System.out.println(nome + " comendo.");
            energia = Math.min(energia + 1, 10);
            fome--;
        } else {
            System.out.println(nome + " sem fome.");
        }
    }   

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " dormindo.");
            sono--;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        } else {
            System.out.println(nome + " sem sono.");
        }
    }

}
