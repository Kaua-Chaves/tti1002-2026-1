package apostila_02;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("joão",10,0,0);
        Personagem soneca = new Personagem(10,0,0);

//        cacador.nome = "João";
        soneca.nome = "Soneca";
        // cacador.energia=20;
        // System.out.println(cacador.energia);
        // Entrada para permitir parametrizar o valor das repetições do laço for
        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas caçadas o jogador deve realizar?"));

        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            System.out.println("====================");

            for (int i=0; i<=repeticoes;i++) {
                cacador.cacar();
            }
        
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();

//            try {
                Thread.sleep(2000);
/*             } catch (InterruptedException e) {
                //System.out.println("Usuário encerrou o programa");
                e.printStackTrace();
            } */
        }
    }
}
