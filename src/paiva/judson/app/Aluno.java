package paiva.judson.app;

import java.util.Locale;

public class Aluno extends Pessoa{

    private String matricula;

    public Aluno() {
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, double subsídio, String matricula) {
        super(nome, idade, subsídio);
        this.matricula = matricula;
    }

    private String getMatricula(){
        return matricula.toUpperCase();
    }

    @Override
    void mostrarDados(){
        System.out.printf("Nome: %s tem %d de idade e aufere %f kz de subsídio e o número de matrícula: %s \n",
                this.getNome(),
                this.getIdade(),
                this.getSubsídio(),
                this.getMatricula());
    }

}
