package apostila_02;

public class Jogo {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        personagem1.nome = "João";

        personagem1.cacar();
        personagem1.comer();
        personagem1.dormir();
    }
}
