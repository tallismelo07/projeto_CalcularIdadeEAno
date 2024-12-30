package CalculadoraDeIdade.packageCalcularIdade;

public class CalcularIdade {
    private int anoDeNascimneto;

    public int getAnoDeNascimneto() {
        return anoDeNascimneto;
    }

    public void setAnoDeNascimneto(int anoDeNascimneto) {
        this.anoDeNascimneto = anoDeNascimneto;
    }

    public int calcularIdade(int anoAtual){
        return anoAtual - anoDeNascimneto;
    }

    public  int calcularAnoDeNascimento(int idadeAtual){
        return idadeAtual - anoDeNascimneto;
    }

    public void exibirMenu(){
        System.out.println("---- CALCULADORA DE IDADE ----");
        System.out.println("1. Calcular Ano para Idade");
        System.out.println("2. Calcular Idade para Ano");
        System.out.println("0. Sair do Programa");
        System.out.println("------------------------------");

    }
}
