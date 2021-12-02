package paiva.judson.app;

public class Pessoa {

    private String nome;
    private int idade;
    private double subsídio;


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
        this.setIdade(idade);
    }

    public Pessoa(String nome, int idade, double subsídio) {
        this.nome = nome;
        this.setIdade(idade);
        this.subsídio = subsídio;
    }

    void mostrarDados(){
        System.out.printf("Nome: %s tem %d de idade e aufere %f kz de subsídio \n",
                           this.nome,
                           this.idade,
                           this.subsídio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >=0 && idade <=120)
            this.idade = idade;
        else
            System.out.printf("Idade inválida");
    }

    public double getSubsídio() {
        return subsídio;
    }

    public void setSubsídio(double subsídio) {
        this.subsídio = subsídio;
    }




}
