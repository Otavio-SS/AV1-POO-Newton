package br.com.questao2;

public class Professor extends Pessoa{
    public float salarioHora;
    public int horasAula;

    public Professor(String nome, String email, String senha, float salarioHora, int horasAula) {
        super(nome, email, senha);
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double calculaSalario (){
        return (getSalarioHora()*getHorasAula());
    }

    public String mostraProfessor(){
        return ("Nome: "
                +getNome()+ " Email: "
                +getEmail()+ "Salário: "
                +calculaSalario());
    }
}
