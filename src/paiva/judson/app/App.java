package paiva.judson.app;

import paiva.judson.app.testmodificadores.Bolseiro;

public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();


        p1.nome = "Judson Paiva";
        p1.idade = 27;
        p1.mostrarDados();


        Pessoa p2 = new Pessoa();
        p2.mostrarDados();

        Pessoa p3 = new Pessoa("Leona José", 24, 250.0);
        p3.mostrarDados();

        Bolseiro bolseiro = new Bolseiro();


    }
}
