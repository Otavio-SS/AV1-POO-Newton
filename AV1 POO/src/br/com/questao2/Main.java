package br.com.questao2;

public class Main {
    public static void main(String[] args) {
       Professor professor = new Professor("Sergio","serginhoreclamao@gmail.com","fifanorenbo",120,20);
        System.out.println(professor.mostraProfessor());
        Aluno aluno = new Aluno("Tugas", "estudomafia@gmail.com","renbonofifa",3, 25);
        System.out.println(aluno.mostraAluno());
    }
}
