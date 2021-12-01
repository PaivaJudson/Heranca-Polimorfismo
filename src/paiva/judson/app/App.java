package paiva.judson.app;

public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Judson Paiva";
        p1.idade = 27;

        p1.mostrarDados();
    }
}
