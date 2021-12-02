package paiva.judson.app;

public final class Professor extends Pessoa{
    private String formacao;


    public Professor(String formacao) {
        this.formacao = formacao;
    }

    public Professor(String nome, String formacao) {
        super(nome);
        this.formacao = formacao;
    }

    public Professor(String nome, int idade, String formacao) {
        super(nome, idade);
        this.formacao = formacao;
    }

    public Professor(String nome, int idade, double subsídio, String formacao) {
        super(nome, idade, subsídio);
        this.formacao = formacao;
    }

    private String getFormacao(){
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    void mostrarDados(){
        System.out.printf("Nome: %s tem %d de idade e é Formado em: %s \n",
                this.getNome(),
                this.getIdade(),
                this.getFormacao());
    }
}
