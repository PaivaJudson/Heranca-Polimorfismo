package paiva.judson.app;

public class Pessoa {
    protected String nome;
    public int idade;
    protected double subsídio;


    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, double subsídio) {
        this.nome = nome;
        this.idade = idade;
        this.subsídio = subsídio;
    }

    void mostrarDados(){
        System.out.printf("Nome: %s tem %d de idade e aufere %f kz de subsídio \n", this.nome, this.idade, this.subsídio);
    }
}
