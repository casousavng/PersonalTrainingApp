package personaltraining_app.exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicios {

    //Atributos protected
    protected String nomeDoExercicio;
    protected String instrucoes;
    protected String materiaisAUsar;
    protected int repeticoes;
    protected double peso;
    protected double tempoDescanso;

    // Atributo de classe
    protected static int contadorExercicios = 0;

    //Construtores com parâmetros
    public Exercicios(String nomeDoExercicio, String instrucoes, String materiaisAUsar, int repeticoes, double peso, double tempoDescanco) {
        this.nomeDoExercicio = nomeDoExercicio;
        this.instrucoes = instrucoes;
        this.materiaisAUsar = materiaisAUsar;
        this.repeticoes = repeticoes;
        this.peso = peso;
        this.tempoDescanso = tempoDescanco;
    }

    public Exercicios(String nomeDoExercicio, String instrucoes, int repeticoes) {
        this.nomeDoExercicio = nomeDoExercicio;
        this.instrucoes = instrucoes;
        this.repeticoes = repeticoes;
    }

    //Construtores sem parâmetros
    public Exercicios() {
        contadorExercicios++;
    }
    
    
    // Construtor de cópia
    public Exercicios(Exercicios outro) {
        this.nomeDoExercicio = outro.nomeDoExercicio;
        this.instrucoes = outro.instrucoes;
        this.materiaisAUsar = outro.materiaisAUsar;
        this.repeticoes = outro.repeticoes;
        this.peso = outro.peso;
        this.tempoDescanso = outro.tempoDescanso;
        contadorExercicios++;
    }

    public String getNomeDoExercicio() {
        return nomeDoExercicio;
    }

    public void setNomeDoExercicio(String nomeDoExercicio) {
        this.nomeDoExercicio = nomeDoExercicio;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String intrucoes) {
        this.instrucoes = intrucoes;
    }

    public String getMateriaisAUsar() {
        return materiaisAUsar;
    }

    public void setMateriaisAUsar(String materiaisAUsar) {
        this.materiaisAUsar = materiaisAUsar;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanco(double tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public static int getContadorExercicios() {
        return contadorExercicios;
    }
    
        
     // Método print() para imprimir os atributos
    public void print() {
        System.out.println(this.toString());
    }
    
    // Método toString() com override
    @Override
    public String toString() {
        return nomeDoExercicio + ", Instruções: " + instrucoes + ", Material A Usar: " + materiaisAUsar;
    }
    
    
     // Método clone() com override
    @Override
    public Exercicios clone() {
        return new Exercicios(this);
    }

    // Método equals() com override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Exercicios that = (Exercicios) obj;
        return repeticoes == that.repeticoes &&
                Double.compare(that.peso, peso) == 0 &&
                Double.compare(that.tempoDescanso, tempoDescanso) == 0 &&
                nomeDoExercicio.equals(that.nomeDoExercicio) &&
                instrucoes.equals(that.instrucoes) &&
                materiaisAUsar.equals(that.materiaisAUsar);
    }
    
}
