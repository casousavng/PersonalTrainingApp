package personaltraining_app.exercicios;

public class UpperBody extends Musculacao {
    
    public UpperBody(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanco , int series) {
        super(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanco);
        this.series = series;
    }
}
