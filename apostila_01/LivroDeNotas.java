package apostila_01;

public class LivroDeNotas {
   private String nomeDoCurso;

   public LivroDeNotas(String nomeDoCurso){
      this.nomeDoCurso = nomeDoCurso;
   }


   public String getNomeDoCurso() {
      return nomeDoCurso;
   }

   public void setNomeDoCurso(String nomeDoCurso) {
      this.nomeDoCurso = nomeDoCurso;
   }

   public void exibirMensagem() {
      if(this.nomeDoCurso != null) {
         System.out.printf("Bem-vindo ao Livro de Notas para o curso: %s!%n", this.nomeDoCurso);
      } else {
         System.out.println("Bem-vindo ao Livro de Notas!");
      }
   }


}
