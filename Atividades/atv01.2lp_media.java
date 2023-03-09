public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;
 
    public Aluno(String nome, double nota1, double nota2, double nota3) {
       this.nome = nome;
       this.nota1 = nota1;
       this.nota2 = nota2;
       this.nota3 = nota3;
    }
 
    public double calcularmedia() {
       return (nota1 + nota2 + nota3) / 3;
    }
 
    public void situacao() {
       double media = calcularmedia();
 
       System.out.println("Média: " + media);
 
       if (media >= 70) {
          System.out.println("Aluno aprovado!");
       } else if (media < 40) {
          System.out.println("Aluno reprovado!");
       } else {
          System.out.println("Aluno em exame final!");
       }
    }
 
    public static void main(String[] args) {
       Aluno aluno = new Aluno("Zé", 80, 70, 60);
 
       aluno.situacao();
    }
 }


