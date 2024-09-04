package Chamada;
public class Chamada {
    private String nomeCurso;
    private String nomeProfessor;

    public Chamada(String nomeCurso, String nomeProfessor) {
        this.nomeCurso = nomeCurso;
        this.nomeProfessor = nomeProfessor;
    }

    public void chamada() {
        System.out.println("Curso: " + nomeCurso + " \n Professor: " + nomeProfessor);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
