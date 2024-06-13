package personaltraining_app.exercicios;

public class LowerBody extends Musculacao {
    
     public LowerBody(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanso, int series) {
        super(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanso);
        this.series = series;
    }
}
