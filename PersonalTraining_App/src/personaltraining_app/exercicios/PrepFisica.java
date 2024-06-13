
package personaltraining_app.exercicios;

public abstract class PrepFisica extends Exercicios{
    
    String tipoTreino;

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public PrepFisica(String nomeDoExercicio, String instrucoes, int repeticoes) {
        super(nomeDoExercicio, instrucoes, repeticoes);
    }    
}
