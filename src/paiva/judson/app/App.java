package paiva.judson.app;

import paiva.judson.app.testmodificadores.Bolseiro;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p1 = new Pessoa();


        p1.setNome("Judson Paiva");
        p1.setIdade(27);
        p1.mostrarDados();

        Pessoa p2 = new Pessoa("Quissanga Coge", -1);


        Pessoa p3 = new Pessoa("Leona José", 24, 250.0);
        p3.mostrarDados();

        Bolseiro bolseiro = new Bolseiro();


    }
}
