package br.senai.sp.jandira.imc_condicional.model;

import java.util.Scanner;

public class ImcCalculosEVerificacao {

    double imc;
    String nomeDoAluno;
    double peso;
    double altura;
    String classificação;

    public void receberDados(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------------------");

        System.out.println("*****CALCULADORA DE IMC*****");

        System.out.println("-----------------------------------------------");

        System.out.println();

        System.out.print("Digite o nome do aluno: ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Digite o peso (em kg): ");
        peso = leitor.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        altura = leitor.nextDouble();

        calcularImc();
    }
    public void calcularImc(){

        imc = peso / (altura * altura) ;

        exibirClassificaçãoDoImc();
    }
    public void exibirClassificaçãoDoImc(){

        if (imc<= 18.6){
            classificação = "Abaixo do peso";
        } else if (imc >= 18.6 && imc< 25) {
            classificação = "Peso ideal (PARABÉNS)";
        } else if (imc >= 25.0 && imc < 30.0){
            classificação = "Levemente acima do peso";
        }else if (imc >= 30.0 && imc < 35){
            classificação = "Obesidade grau I";
        } else if (imc >= 35.0 && imc < 40){
            classificação = "Obesidade grau III (Severa)";
        } else {
            classificação = "Obesidade III (Mórbida)";
        }

        exibirResultadosAoUsuario();
    }

    public void exibirResultadosAoUsuario(){
        String valorImcComDoisDecimais = String.format("%.2f",imc );

        System.out.println("-----RESULTADO-----");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("IMC Calculado: " + valorImcComDoisDecimais);
        System.out.println("Status: " + classificação );
        System.out.println("-------------------");
    }
}

