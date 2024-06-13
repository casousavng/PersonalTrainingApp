package personaltraining_app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import personaltraining_app.exercicios.TreinoForca;

public class TreinoForcaService {

    private final List<TreinoForca> listaTreinoForca;

    // Construtor com parametros
    public TreinoForcaService(List<TreinoForca> listaTreinoForca) {
        this.listaTreinoForca = listaTreinoForca;
    }

    // Construtor sem parametros
    public TreinoForcaService() {
        this.listaTreinoForca = new ArrayList<>();
    }
    
    // Construtor de cópia
    public TreinoForcaService(TreinoForcaService outroTreinoForcaService) {
        this.listaTreinoForca = outroTreinoForcaService.listaTreinoForca;
    }
    
    // Método para obter todos os exercícios de TreinoForca disponíveis
    public List<TreinoForca> getListaTreinoForca() {
        return listaTreinoForca;
    }

    // Método para adicionar um exercício de TreinoForca à lista
    public void adicionarExercicio(TreinoForca exercicio) {
        listaTreinoForca.add(exercicio);
    }

    // Método para ler os dados do arquivo e criar objetos TreinoForca
    public void lerExerciciosDoArquivo() {
        
        String caminhoArquivo = "/personaltraining_app/resources/Dados/TreinoForca_Exer.txt";
        
        try (InputStream inputStream = getClass().getResourceAsStream(caminhoArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) { 
                    String nomeDoExercicio = partes[0];
                    String instrucoes = partes[1];
                    int repeticoes = Integer.parseInt(partes[2]);

                    // Cria um objeto TreinoForca com os dados lidos e adiciona à lista
                    TreinoForca exercicio = new TreinoForca(nomeDoExercicio, instrucoes, repeticoes);
                    listaTreinoForca.add(exercicio);
                }
            }
        } catch (IOException e) {
        }
    }

 @Override
    public String toString() {
        
        StringBuilder outputGrafico = new StringBuilder();
        int numExercicios = 3; // numero total de exercicios a apresentar
        
        Collections.shuffle(listaTreinoForca);
        
        // Output do exercicio: Nome + Instruções + Repetições
        
        for (TreinoForca exercicio : listaTreinoForca) {
            if (numExercicios > 0){ // 
                outputGrafico.append("Nome do Exercicio: ").append(exercicio.getNomeDoExercicio()).append("\n");
                outputGrafico.append("Instruçõees: ").append(exercicio.getInstrucoes()).append("\n");
                if (numExercicios > 1)
                    outputGrafico.append("Repetições: ").append(exercicio.getRepeticoes()).append("\n\n");
                else
                    outputGrafico.append("Repetições: ").append(exercicio.getRepeticoes()).append("\n");
                numExercicios--;
            }
            else
                break;
            } 
        return outputGrafico.toString();
    }
}