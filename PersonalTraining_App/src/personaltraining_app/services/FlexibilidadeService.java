package personaltraining_app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import personaltraining_app.exercicios.Flexibilidade;

public class FlexibilidadeService {

    private final List<Flexibilidade> listaFlexibilidade;

    // Construtor com parametros
    public FlexibilidadeService(List<Flexibilidade> listaFlexibilidade) {
        this.listaFlexibilidade = listaFlexibilidade;
    }
 
    // Construtor sem parametros
    public FlexibilidadeService() {
        this.listaFlexibilidade = new ArrayList<>();
    }
    
    // Construtor de cópia
    public FlexibilidadeService(FlexibilidadeService outroFlexibilidadeService) {
        this.listaFlexibilidade = outroFlexibilidadeService.listaFlexibilidade;
    }
    
    // Método para obter todos os exercícios de flexibilidade disponíveis
    public List<Flexibilidade> getListaFlexibilidade() {
        return listaFlexibilidade;
    }

    // Método para adicionar um exercício de flexibilidade à lista 
    public void adicionarExercicio(Flexibilidade flexibilidade) {
        listaFlexibilidade.add(flexibilidade);
    }
    
    // Método para ler os dados do arquivo e criar objetos Flexibilidade
    public void lerExerciciosDoArquivo() {
        
        String caminhoArquivo = "/personaltraining_app/resources/Dados/Flexibilidade_Exer.txt";
        
        try (InputStream inputStream = getClass().getResourceAsStream(caminhoArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 7) { // Ajuste na condição
                    String nomeDoExercicio = partes[0];
                    String instrucoes = partes[1];
                    String materiaisAUsar = partes[2];
                    int repeticoes = Integer.parseInt(partes[3]);
                    double peso = Double.parseDouble(partes[4]);
                    double tempoDescanso = Double.parseDouble(partes[6]); // Correção no índice

                    // Cria um objeto Flexibilidade com os dados lidos e adiciona à lista
                    Flexibilidade flexibilidade = new Flexibilidade(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanso);
                    listaFlexibilidade.add(flexibilidade);
                }
            }
        } catch (IOException e) {
        }
    }

 @Override
    public String toString() {
        
        // Método para escolher aleatoriamente três exercícios de flexibilidade e mostrá-los
        
        StringBuilder outputGrafico = new StringBuilder();
        int numExercicios = 3; // numero total de exercicios a apresentar
        
        Collections.shuffle(listaFlexibilidade);
        
        // Output do exercicio: Nome + Instruções + Materiais + Repetições + Tempo descanso
        
        for (Flexibilidade exercicio : listaFlexibilidade) {
            if (numExercicios > 0){ // 
                outputGrafico.append("Nome do Exercicio: ").append(exercicio.getNomeDoExercicio()).append("\n");
                outputGrafico.append("Instruções: ").append(exercicio.getInstrucoes()).append("\n");
                outputGrafico.append("Materiais a Usar: ").append(exercicio.getMateriaisAUsar()).append("\n");
                outputGrafico.append("Repetições: ").append(exercicio.getRepeticoes()).append("\n");
                if (numExercicios > 1)
                    outputGrafico.append("Tempo de Descanso: ").append(exercicio.getTempoDescanso()).append(" segundos\n\n");
                else
                   outputGrafico.append("Tempo de Descanso: ").append(exercicio.getTempoDescanso()).append(" segundos\n"); 
                numExercicios--;
            }
            else
                break;
            } 
        return outputGrafico.toString();
    }
  
}
