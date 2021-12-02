package paiva.judson.app;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p1 = new Pessoa();

        Professor p2 = new Professor("Judson Paiva", 100, 1000000.0, "2020");
        Pessoa p3 = new Pessoa("Leona José", 24, 250.0);
        Aluno a1 = new Aluno("Barbas Sebastião", 25, 300, "2021");

        mostrar(a1);
        mostrar(p2);
        mostrar(p3);
    }

    public static void mostrar(Pessoa pessoa){
        pessoa.mostrarDados();
    }
}
