package paiva.judson.app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

        lista.add(new Professor("Judson Paiva", 100, 1000000.0, "2020"));
        lista.add(new Pessoa("Leona José", 24, 250.0));
        lista.add(new Aluno("Barbas Sebastião", 25, 300, "2021"));
        lista.add(new Aluno("Quissanga Coge", 27, 300, "2021"));


        for (Pessoa pessoa: lista) {
            mostrar(pessoa);
        }
    }

    public static void mostrar(Pessoa pessoa){
        pessoa.mostrarDados();
    }
}
