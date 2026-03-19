package apostila_02;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("joão",10,1,1);
        Personagem soneca = new Personagem(10,1,2);

//        cacador.nome = "João";
        soneca.nome = "Soneca";
        // cacador.energia=20;
        // System.out.println(cacador.energia);
        // Entrada para permitir parametrizar o valor das repetições do laço for
        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas caçadas o jogador deve realizar?"));

//        while (true) {
        for (int i = 0; i <= repeticoes; i++) {
            cacador.cacar();
            cacador.exibirEstado();
            cacador.comer();
            cacador.exibirEstado();
            cacador.dormir();
            cacador.exibirEstado();
            // System.out.println("====================");

            cacador.cacar();
            cacador.exibirEstado();
        
            cacador.cacar();
            cacador.exibirEstado();
            cacador.cacar();
            cacador.exibirEstado();
            cacador.cacar();
            cacador.exibirEstado();

//            try {
                Thread.sleep(2000);
/*             } catch (InterruptedException e) {
                //System.out.println("Usuário encerrou o programa");
                e.printStackTrace();
            } */
        }
    }
}
