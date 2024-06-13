package personaltraining_app.exercicios;

public class Cardio extends Exercicios {

    double duracao;
   
    public Cardio(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanso, double duracao) {
        super(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanso);
        this.duracao = duracao;   
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
