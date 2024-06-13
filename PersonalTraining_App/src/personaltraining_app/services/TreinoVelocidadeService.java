package personaltraining_app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import personaltraining_app.exercicios.TreinoVelocidade;

public class TreinoVelocidadeService {

    private final List<TreinoVelocidade> listaTreinoVelocidade;

    // Construtor com parametros
    public TreinoVelocidadeService(List<TreinoVelocidade> listaTreinoVelocidade) {
        this.listaTreinoVelocidade = listaTreinoVelocidade;
    }
   
    // Construtor sem parametros
    public TreinoVelocidadeService() {
        this.listaTreinoVelocidade = new ArrayList<>();
    }
    
    // Construtor de cópia
    public TreinoVelocidadeService(TreinoVelocidadeService outroTreinoVelocidadeService) {
        this.listaTreinoVelocidade = outroTreinoVelocidadeService.listaTreinoVelocidade;
    }
    
    // Método para obter todos os exercícios de TreinoVelocidadeService disponíveis
    public List<TreinoVelocidade> getListaTreinoVelocidade() {
        return listaTreinoVelocidade;
    }

    // Método para adicionar um exercício de TreinoVelocidadeService à lista
    public void adicionarExercicio(TreinoVelocidade exercicio) {
        listaTreinoVelocidade.add(exercicio);
    }

    // Método para ler os dados do arquivo e criar objetos TreinoVelocidadeService
    public void lerExerciciosDoArquivo() {
        
        String caminhoArquivo = "/personaltraining_app/resources/Dados/TreinoVelocidade_Exer.txt";
  
        try (InputStream inputStream = getClass().getResourceAsStream(caminhoArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) { 
                    String nomeDoExercicio = partes[0];
                    String instrucoes = partes[1];
                    int repeticoes = Integer.parseInt(partes[2]);

                    // Cria um objeto TreinoVelocidadeService com os dados lidos e adiciona à lista
                    TreinoVelocidade exercicio = new TreinoVelocidade(nomeDoExercicio, instrucoes, repeticoes);
                    listaTreinoVelocidade.add(exercicio);
                }
            }
        } catch (IOException e) {
        }
    }

 @Override
    public String toString() {
        
        StringBuilder outputGrafico = new StringBuilder();
        int numExercicios = 3; // numero total de exercicios a apresentar
        
        Collections.shuffle(listaTreinoVelocidade);
        
        // Output do exercicio: Nome + Instruções + Repetições
        
        for (TreinoVelocidade exercicio : listaTreinoVelocidade) {
            if (numExercicios > 0){ // 
                outputGrafico.append("Nome do Exercicio: ").append(exercicio.getNomeDoExercicio()).append("\n");
                outputGrafico.append("Instruções: ").append(exercicio.getInstrucoes()).append("\n");
                outputGrafico.append("Repetições: ").append(exercicio.getRepeticoes()).append("\n\n");
                numExercicios--;
            }
            else
                break;
            } 
        return outputGrafico.toString();
    }
}