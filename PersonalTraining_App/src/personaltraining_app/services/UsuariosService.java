package personaltraining_app.services;

import personaltraining_app.exercicios.Usuario;

public class UsuariosService {
       
    private double imc;
    private double percentualGordura;
    private double iac;
    private String estadoIMC;
    private String estadoPG;
    private String estadoIAC;

    // Contrutor sem parametros
    public UsuariosService() {
        this.imc = 0;
        this.percentualGordura = 0;
        this.iac = 0;
        this.estadoIMC = null;  
        this.estadoPG = null;
        this.estadoIAC = null;
    }

    // Construtor com parametros
    public UsuariosService(double imc, double percentualGordura, double iac, String estadoIMC, String estadoPG, String estadoIAC) {
        this.imc = imc;
        this.percentualGordura = percentualGordura;
        this.iac = iac;
        this.estadoIMC = estadoIMC;
        this.estadoPG = estadoPG;
        this.estadoIAC = estadoIAC;
    }
    
    // Construtor de cópia
    public UsuariosService(UsuariosService outroUsuario) {
        this.imc = outroUsuario.imc;
        this.percentualGordura = outroUsuario.percentualGordura;
        this.iac = outroUsuario.iac;
        this.estadoIMC = outroUsuario.estadoIMC;
        this.estadoPG = outroUsuario.estadoPG;
        this.estadoIAC = outroUsuario.estadoIAC;
    }

    public String getEstadoIMC() {
        return estadoIMC + "\nLembre-se que a nossa aplicacao tambem disponibiliza treinos especializados, caso procure algo especifico de acordo com a sua situacao.";
    }

    public void setEstadoIMC(String estado) {
        this.estadoIMC = estado;
    }
    
    public String getEstadoPG() {
        return estadoPG + "\nDeve ter em atencao que este calculo é uma estimativa e deve fazer uma consulta de bioimpedancia para resultados mais coerentes.";
    }

    public void setEstadoPG(String estadoPG) {
        this.estadoPG = estadoPG;
    }
    
    public String getEstadoIAC() {
        
        String texto = """
                       Importância do IAC:
                       Mais preciso para avaliar a composição corporal em algumas populações do que o IMC.
                       Considera a distribuição de gordura, o que é importante para avaliar riscos metabólicos.
                       Vantagens:
                       Calculável em casa com medidas simples.
                       Fornece uma estimativa direta da gordura corporal.
                       Pode ser mais representativo para pessoas com massas musculares e densidades ósseas variadas.
                       """;
        
        return estadoIAC + texto;
    }

    public void setEstadoIAC(String estadoIAC) {
        this.estadoIAC = estadoIAC;
    }


    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public double getPercentualGordura() {
        return percentualGordura;
    }

    public void setPercentualGordura(double percentualGordura) {
        this.percentualGordura = percentualGordura;
    }
    
    public double getIac() {
        return iac;
    }

    public void setIac(double iac) {
        this.iac = iac;
    }

    public void calcularIMC(Usuario usuario) {

        double alturaMetros = usuario.getAltura() / 100; // Converter altura para metros
        this.imc = usuario.getPeso() / (alturaMetros * alturaMetros);

        if (imc < 18.5) {
            estadoIMC = "Abaixo do peso. Indica que o seu peso está abaixo do considerado saudável para a sua altura. Isso pode indicar má nutrição ou outros problemas de saúde. É importante consultar um médico ou nutricionista para avaliar a sua dieta e estilo de vida.";
        } else if (imc >= 18.5 && imc < 24.9) {
            estadoIMC = "Peso normal. Parabéns, o seu IMC está dentro da faixa considerada saudável! Isso indica que o seu peso está adequado à sua altura. Continue com hábitos saudáveis, como uma dieta balanceada e atividade física regular, para manter a sua saúde.";
        } else if (imc >= 24.9 && imc < 29.9) {
            estadoIMC = "Sobrepeso. O seu IMC indica que está acima do peso considerado saudável para a sua altura. Isso pode aumentar o risco de desenvolver problemas de saúde como diabetes, hipertensão e doenças cardíacas. É importante fazer mudanças na sua dieta e estilo de vida, como reduzir o consumo de alimentos calóricos e aumentar a atividade física.";
        } else if (imc >= 29.9 && imc < 34.9) {
            estadoIMC = "Obesidade grau I. O seu IMC indica obesidade de grau I, o que significa que está significativamente acima do peso considerado saudável para a sua altura. Isso pode aumentar significativamente o risco de problemas de saúde graves, incluindo diabetes tipo 2, doenças cardíacas, acidente vascular cerebral e alguns tipos de câncer. É essencial procurar ajuda médica e fazer mudanças significativas na dieta e no estilo de vida para reduzir o risco de complicações.";
        } else if (imc >= 34.9 && imc < 39.9) {
            estadoIMC = "Obesidade grau II. O seu IMC indica obesidade de grau II, o que significa que está em alto risco de desenvolver problemas de saúde graves. Isso pode incluir diabetes tipo 2, hipertensão arterial, doenças cardíacas, acidente vascular cerebral e outras condições de saúde. É crucial procurar orientação médica e fazer mudanças drásticas na dieta e no estilo de vida para melhorar a saúde e reduzir o risco de complicações.";
        } else {
            estadoIMC = "Obesidade grau III (mórbida). O seu IMC indica obesidade de grau III, também conhecida como obesidade mórbida. Isso representa um sério risco à saúde e pode levar a uma série de problemas de saúde graves e até mesmo à morte prematura. É essencial procurar ajuda médica imediatamente e implementar mudanças drásticas na dieta, no estilo de vida e possivelmente considerar opções médicas ou cirúrgicas para tratar a obesidade.";
        }
    }
    
    public void calcularPercentualGordura(Usuario usuario, String tipo) {
        
        // Fórmula mais precisa para o cálculo do percentual de gordura corporal
        double densidadeCorporal = 1.1682 - 0.00106 * usuario.getCircunferenciaQuadril() + 0.0007 * (usuario.getAltura()/100);
        this.percentualGordura = (495 / densidadeCorporal) - 450;
     
        // percentual gordura homem
        if (tipo.equals("homem")){               
            if (percentualGordura >= 2 && percentualGordura <= 5.99) {
                estadoPG = "Apresenta a Gordura Essencial.";     
            } else if (percentualGordura >= 6 && percentualGordura <= 13.99) {
                estadoPG = "Percentual perfeito para Atletas.";  
            } else if (percentualGordura >= 14 && percentualGordura <= 17.99) {
                estadoPG = "Percentual ideal para praticantes de Atividade Fisica Moderada."; 
            } else if (percentualGordura >= 18 && percentualGordura <= 24.99) {
                estadoPG = "Percentual ainda Aceitavel."; 
            } else if (percentualGordura >= 25) {
                estadoPG = "Apresenta-se com Obesidade."; 
            }   
        }
        // percentual  gordura mulher
        else if (tipo.equals("mulher")){
            if (percentualGordura >= 10 && percentualGordura <= 13.99) {
                estadoPG = "Apresenta a Gordura Essencial.";     
            } else if (percentualGordura >= 14 && percentualGordura <= 20.99) {
                estadoPG = "Percentual perfeito para Atletas.";  
            } else if (percentualGordura >= 21 && percentualGordura <= 24.99) {
                estadoPG = "Percentual ideal para praticantes de Atividade Fisica Moderada."; 
            } else if (percentualGordura >= 25 && percentualGordura <= 31.99) {
                estadoPG = "Percentual ainda Aceitavel.."; 
            } else if (percentualGordura >= 32) {
                estadoPG = "Apresenta-se com Obesidade."; 
            } 
        }   
    }
    
    public void calcularIAC(Usuario usuario, String tipo) {

        double alturaMetros = usuario.getAltura() / 100; // Converter altura para metros
        this.iac = (usuario.getCircunferenciaQuadril() / Math.pow(alturaMetros, 1.5)) - 18;

        // adiposidade corporal homem
        if (tipo.equals("homem")){               
            if (iac < 7.99){
                estadoIAC = "";
            }else if (iac >= 8 && iac <= 19.99) {
                estadoIAC = "Apresenta um Indice de Adiposidade corporal Normal.\n";     
            } else if (iac >= 20 && iac <= 24.99) {
                estadoIAC = "Encontra-se com Sobrepeso.\n";  
            } else if (iac >= 25) {
                estadoIAC = "Estado de Obesidade.\n"; 
            }   
        }
        // adiposidade corporal mulher
        else if (tipo.equals("mulher")){
            if (iac < 20.99){
                estadoIAC = "";
            }else if (iac >= 21 && iac <= 31.99) {
                estadoIAC = "Apresenta um Indice de Adiposidade corporal Normal.\n";     
            } else if (iac >= 32 && iac <= 37.99) {
                estadoIAC = "Encontra-se com Sobrepeso.\n";   
            } else if (iac >= 32) {
                estadoIAC = "Estado de Obesidade.\n"; 
            } 
        }   
    }
    
}
