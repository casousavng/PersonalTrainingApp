
package personaltraining_app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TreinoDoDiaService {
    
    Random random = new Random();
    private int index;
    private final List<String> tiposDeTreino;
    private String tipoDeTreino;

    public String getTipoDeTreino() {
        return tipoDeTreino;
    }

    public void setTipoDeTreino(String tipoDeTreino) {
        this.tipoDeTreino = tipoDeTreino;
    }

    public TreinoDoDiaService() {
        tiposDeTreino = new ArrayList<>();
        tiposDeTreino.add("Cardio");
        tiposDeTreino.add("Flexibilidade");
        tiposDeTreino.add("Musculação LowerBody");
        tiposDeTreino.add("Musculação UpperBody");
        tiposDeTreino.add("Musculação FullBody");
        tiposDeTreino.add("Força");
        tiposDeTreino.add("Velocidade");
        tiposDeTreino.add("Resistência");
    }

    public void treinoDoDia() {
        // Selecionar aleatoriamente um tipo de treino para aquele dia
        index = random.nextInt(tiposDeTreino.size());
        tipoDeTreino = tiposDeTreino.get(index);
    }
}
