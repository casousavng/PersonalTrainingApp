package personaltraining_app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import personaltraining_app.exercicios.Cardio;

public class CardioService {

    private final List<Cardio> listaCardio;
    
    // Construtor com parametros
    public CardioService(List<Cardio> listaCardio) {
        this.listaCardio = listaCardio;
    }
    
    // Construtor sem parametros
    public CardioService() {
        this.listaCardio = new ArrayList<>();
    }
    
    // Construtor de cópia
    public CardioService(CardioService outroCardioService) {
        this.listaCardio = outroCardioService.listaCardio;
    }

    public List<Cardio> getListaCardio() {
        return listaCardio;
    }

    // Método para adicionar um exercício de cardio à lista 
    public void adicionarExercicio(Cardio cardio) {
        listaCardio.add(cardio);
    }
    
    // Método para ler os dados do arquivo e criar objetos Cardio
    public void lerExerciciosDoArquivo() {
        
        String caminhoArquivo = "/personaltraining_app/resources/Dados/Cardio_Exer.txt";
        
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
                    double tempoDescanso = Double.parseDouble(partes[5]); // Correção no índice
                    double duracao = Double.parseDouble(partes[6]);

                    // Cria um objeto Cardio com os dados lidos e adiciona à lista
                    Cardio cardio = new Cardio(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanso, duracao);
                    listaCardio.add(cardio);
                }
            }
        } catch (IOException e) {
        }
    }

 @Override
    public String toString() {
        
        // Método para escolher aleatoriamente três exercícios e mostrá-los
        StringBuilder outputGrafico = new StringBuilder();
        int numExercicios = 3; // numero total de exercicios a apresentar
        
        Collections.shuffle(listaCardio);
        
        // Output do exercicio: Nome + Instruções + Materiais + Repetições + Duração
        
        for (Cardio exercicio : listaCardio) {        
            if (numExercicios > 0){ // 
                outputGrafico.append("Nome do Exercicio: ").append(exercicio.getNomeDoExercicio()).append("\n");
                outputGrafico.append("Instruções: ").append(exercicio.getInstrucoes()).append("\n");
                outputGrafico.append("Materiais a Usar: ").append(exercicio.getMateriaisAUsar()).append("\n");
                outputGrafico.append("Repetições: ").append(exercicio.getRepeticoes()).append("\n");
                if (numExercicios > 1)
                    outputGrafico.append("Duração: ").append(String.format("%.2f", exercicio.getDuracao())).append(" minutos\n\n");
                else
                    outputGrafico.append("Duração: ").append(String.format("%.2f", exercicio.getDuracao())).append(" minutos\n");   
                numExercicios--;
            }
            else
                break;
            } 
        return outputGrafico.toString();
    }
  
}
