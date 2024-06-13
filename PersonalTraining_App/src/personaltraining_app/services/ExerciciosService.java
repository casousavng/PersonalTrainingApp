package personaltraining_app.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import personaltraining_app.exercicios.Exercicios;

public class ExerciciosService {
    
    private final List<Exercicios> listaExercicios;

    // Construtor com parametros
    public ExerciciosService(List<Exercicios> listaExercicios) {
        this.listaExercicios = listaExercicios;
    }
        
    // Construtor sem paramentros
    public ExerciciosService() {
        this.listaExercicios = new ArrayList<>();
    }
    
    // Construtor de cópia
    public ExerciciosService(ExerciciosService outrosExercicios) {
        this.listaExercicios = outrosExercicios.listaExercicios;
    }

    public void adicionarExercicio(Exercicios exercicio) {
        this.listaExercicios.add(exercicio);
    }

    public List<Exercicios> buscarExercicios() {
        return this.listaExercicios;
    }
    
    public static void salvarListaExercicios(String texto) {
        
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String dataHoraFormatada = agora.format(dataFormatada);
        
        String caminhoAmbienteDeTrabalho = System.getProperty("user.home") + "/Desktop/" + "ListaExerciciosDiarios" + dataHoraFormatada + ".txt";
        
        try (BufferedWriter escritaFicheiro = new BufferedWriter(new FileWriter(caminhoAmbienteDeTrabalho, true))) {
            escritaFicheiro.write(texto); 
            escritaFicheiro.newLine();
        } 
        catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível exportar a lista.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    
}
