package apostila_01;

import javax.swing.JOptionPane;
import apostila_02.Personagem;

public class TesteLivroDeNotas {
    public static void main(String[] args) {

        String primeiroCurso = JOptionPane.showInputDialog("Qual o nome do primeiro curso?");
        String segundoCurso = JOptionPane.showInputDialog("Qual o nome do segundo curso?");

        LivroDeNotas primeiroLivroDeNotas = new LivroDeNotas(primeiroCurso);
        LivroDeNotas segundoLivroDeNotas = new LivroDeNotas(segundoCurso);
        
        primeiroLivroDeNotas.exibirMensagem();
        segundoLivroDeNotas.exibirMensagem();
//        meuLivroDeNotas.setNomeDoCurso(nomeCurso);
//        meuLivroDeNotas.exibirMensagem();

//        meuLivroDeNotas.exibirMensagem(nomeCurso);
        //LivroDeNotas outraReferenciaAoLivroDeNotas = meuLivroDeNotas;
        //outraReferenciaAoLivroDeNotas.exibirMensagem(nomeCurso);
    }
}
