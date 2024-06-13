
package personaltraining_app.exercicios;


public class TreinoResistencia extends PrepFisica {
   
    public TreinoResistencia(String nomeDoExercicio, String instrucoes, int repeticoes) {
        super(nomeDoExercicio, instrucoes, repeticoes);
        this.setTipoTreino("Treino de Resistência");
    }
   
}
