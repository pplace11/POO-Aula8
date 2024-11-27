package aula8.escola;

public class Aluno {
    private String nome;
    private int numeroAluno;
    private String curso;

    public Aluno(String nome, int numeroAluno, String curso){
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString(){
        return "Aluno{" + "nome='" + nome + '\'' + ", numeroAluno=" + numeroAluno + ", curso='"+ curso + '\'' + '}';
    }
}
