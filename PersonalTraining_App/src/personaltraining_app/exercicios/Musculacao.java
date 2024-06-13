
package personaltraining_app.exercicios;

// Classe abstrata base para exercícios de musculação
public abstract class Musculacao extends Exercicios implements ExerciciosMusculacao {
    
    protected int series;

    public Musculacao(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanco) {
        super(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanco);
    }

    @Override
    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public int getSeries() {
        return series;
    }
}
