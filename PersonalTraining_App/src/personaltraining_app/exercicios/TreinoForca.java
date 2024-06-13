
package personaltraining_app.exercicios;


public class TreinoForca extends PrepFisica {
    
    public TreinoForca(String nomeDoExercicio, String instrucoes, int repeticoes) {
        super(nomeDoExercicio, instrucoes, repeticoes);
        this.setTipoTreino("Treino de Força");
    } 
}
