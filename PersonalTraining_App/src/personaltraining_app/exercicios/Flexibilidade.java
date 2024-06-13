package personaltraining_app.exercicios;

public class Flexibilidade extends Exercicios {

    public Flexibilidade(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanco) {
        super(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanco);
    }

    public Flexibilidade(String nomeDoExercicio, String instrucoes, int repeticoes) {
        super(nomeDoExercicio, instrucoes, repeticoes);
    }

}
