package personaltraining_app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import personaltraining_app.exercicios.TreinoResistencia;

public class TreinoResistenciaService {

    private final List<TreinoResistencia> listaTreinoResistencia;

    // Constutor com parametros
    public TreinoResistenciaService(List<TreinoResistencia> listaTreinoResistencia) {
        this.listaTreinoResistencia = listaTreinoResistencia;
    }
    
    // Construtor sem parametros
    public TreinoResistenciaService() {
        this.listaTreinoResistencia = new ArrayList<>();
    }
    
    // Construtor de cópia
    public TreinoResistenciaService(TreinoResistenciaService outroTreinoResistenciaService) {
        this.listaTreinoResistencia = outroTreinoResistenciaService.listaTreinoResistencia;
    }

    // Método para ler os dados do arquivo CSV e criar objetos TreinoResistencia
    public void lerExerciciosDoArquivo() {
        
        String caminhoArquivo = "/personaltraining_app/resources/Dados/TreinoResistencia_Exer.txt";
        
        try (InputStream inputStream = getClass().getResourceAsStream(caminhoArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String nomeDoExercicio = partes[0];
                    String instrucoes = partes[1];
                    int repeticoes = Integer.parseInt(partes[2]);

                    // Cria um objeto TreinoResistencia com os dados lidos e adiciona à lista
                    TreinoResistencia exercicio = new TreinoResistencia(nomeDoExercicio, instrucoes, repeticoes);
                    listaTreinoResistencia.add(exercicio);
                }
            }
        } catch (IOException e) {
        }
    }

 @Override
    public String toString() {
        
        StringBuilder outputGrafico = new StringBuilder();
        int numExercicios = 3; // numero total de exercicios a apresentar
        
        Collections.shuffle(listaTreinoResistencia);
        
        // Output do exercicio: Nome + Instruções + Repetições
        
        for (TreinoResistencia exercicio : listaTreinoResistencia) {
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