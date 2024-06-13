package personaltraining_app.exercicios;

public class Usuario {
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double circunferenciaCintura;
    private double circunferenciaQuadril;
    private double circunferenciaPescoco;


    public Usuario(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Usuario(double peso, double altura, double circunferenciaCintura, double circunferenciaQuadril, double circunferenciaPescoco) {
        this.peso = peso;
        this.altura = altura;
        this.circunferenciaCintura = circunferenciaCintura;
        this.circunferenciaQuadril = circunferenciaQuadril;
        this.circunferenciaPescoco = circunferenciaPescoco;
    }

    // Getters e Setters para todos os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCircunferenciaCintura() {
        return circunferenciaCintura;
    }

    public void setCircunferenciaCintura(double circunferenciaCintura) {
        this.circunferenciaCintura = circunferenciaCintura;
    }

    public double getCircunferenciaQuadril() {
        return circunferenciaQuadril;
    }

    public void setCircunferenciaQuadril(double circunferenciaQuadril) {
        this.circunferenciaQuadril = circunferenciaQuadril;
    }

    public double getCircunferenciaPescoco() {
        return circunferenciaPescoco;
    }

    public void setCircunferenciaPescoco(double circunferenciaPescoco) {
        this.circunferenciaPescoco = circunferenciaPescoco;
    }
}
