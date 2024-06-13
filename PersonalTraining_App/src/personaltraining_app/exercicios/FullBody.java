package personaltraining_app.exercicios;

public class FullBody extends Musculacao {

    public FullBody(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanco , int series) {
        super(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanco);
        this.series = series;
    }

}
