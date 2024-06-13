package personaltraining_app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import personaltraining_app.exercicios.FullBody;

public class FullBodyService {

    private final List<FullBody> listaFullBody;

    // Construtor com parametros
    public FullBodyService(List<FullBody> listaFullBody) {
        this.listaFullBody = listaFullBody;
    }
    
    // Construtor sem parametros
    public FullBodyService() {
        this.listaFullBody = new ArrayList<>();
    }
    
    // Construtor de cópia
    public FullBodyService(FullBodyService outroFullBodyService) {
        this.listaFullBody = outroFullBodyService.listaFullBody;
    }
    
    // Método para obter todos os exercícios de FullBody disponíveis
    public List<FullBody> getListaFullBody() {
        return listaFullBody;
    }

    // Método para adicionar um exercício de FullBody à lista
    public void adicionarExercicio(FullBody exercicio) {
        listaFullBody.add(exercicio);
    }

    // Método para ler os dados do arquivo e criar objetos FullBody
    public void lerExerciciosDoArquivo() {
        
        String caminhoArquivo = "/personaltraining_app/resources/Dados/FullBody_Exer.txt";
        
        try (InputStream inputStream = getClass().getResourceAsStream(caminhoArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 7) { 
                    String nomeDoExercicio = partes[0];
                    String instrucoes = partes[1];
                    String materiaisAUsar = partes[2];
                    int repeticoes = Integer.parseInt(partes[3]);
                    double peso = Double.parseDouble(partes[4]);
                    double tempoDescanco = Double.parseDouble(partes[5]);
                    int series = Integer.parseInt(partes[6]);

                    // Cria um objeto FullBody com os dados lidos e adiciona à lista
                    FullBody exercicio = new FullBody(nomeDoExercicio, instrucoes, materiaisAUsar, repeticoes, peso, tempoDescanco,series);
                    listaFullBody.add(exercicio);
                }
            }
        } catch (IOException e) {
        }
    }

 @Override
    public String toString() {
        
        // Método para escolher aleatoriamente três exercícios e mostrá-los
        
        StringBuilder outputGrafico = new StringBuilder();
        int numExercicios = 5; // numero total de exercicios a apresentar
        
        Collections.shuffle(listaFullBody);
        
        // Output do exercicio: Nome + Instruções + Materiais + Repetições + Peso + Tempo Descanso
        
        for (FullBody exercicio : listaFullBody) {
            if (numExercicios > 0){ // 
                outputGrafico.append("Nome do Exercicio: ").append(exercicio.getNomeDoExercicio()).append("\n");
                outputGrafico.append("Instruções: ").append(exercicio.getInstrucoes()).append("\n");
                outputGrafico.append("Materiais a Usar: ").append(exercicio.getMateriaisAUsar()).append("\n");
                outputGrafico.append("Séries: ").append(exercicio.getSeries()).append("\n");
                outputGrafico.append("Repetições: ").append(exercicio.getRepeticoes()).append("\n");
                if (exercicio.getPeso() != 0)
                   outputGrafico.append("Peso: ").append(exercicio.getPeso()).append(" Kg's\n"); 
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