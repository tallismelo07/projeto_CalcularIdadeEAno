package CalculadoraDeIdade.packagePrincipal;

import CalculadoraDeIdade.packageCalcularIdade.CalcularIdade;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalcularIdade calculadoraDeIdade = new CalcularIdade();


        int opcao = -1;

        while (opcao != 0){
            calculadoraDeIdade.exibirMenu();
            System.out.print("Opção selecionada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Digite seu ano de nascimento: ");
                    int anoDeNascimento = sc.nextInt();
                    calculadoraDeIdade.setAnoDeNascimneto(anoDeNascimento);
                    System.out.print("Digite o ano atual: ");
                    int anoAtual = sc.nextInt();
                    System.out.println(calculadoraDeIdade.calcularIdade(anoAtual));
                    break;
                case 2:
                    System.out.print("Digite seu ano de nascimento: ");
                    anoDeNascimento = sc.nextInt();
                    calculadoraDeIdade.setAnoDeNascimneto(anoDeNascimento);
                    System.out.print("Digite o ano atual: ");
                    int idadeAtual = sc.nextInt();
                    System.out.println(calculadoraDeIdade.calcularAnoDeNascimento(idadeAtual));
                    break;
                default:
                    System.out.println("Saindo do Programa....");
            }
        }
        System.out.println("------------------------------");

    }
}
