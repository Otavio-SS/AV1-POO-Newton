package br.com.questao2;

public class Aluno extends Pessoa{
    public int periodo;
    public int turma;

    public Aluno(String nome, String email, String senha, int periodo, int turma) {
        super(nome, email, senha);
        this.periodo = periodo;
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String mostraAluno(){
        return ("Nome: "
                +getNome()+ " Email: "
                +getEmail()+ " Periodo: "
                +getPeriodo()+ " Turma: "
                +getTurma());
    }
}
