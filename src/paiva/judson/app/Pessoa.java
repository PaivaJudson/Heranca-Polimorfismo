package paiva.judson.app;

public class Pessoa {
    String nome;
    int idade;


    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    void mostrarDados(){
        System.out.printf("Nome: %s tem %d \n", this.nome, this.idade);
    }
}
