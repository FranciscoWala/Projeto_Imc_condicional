package br.senai.sp.jandira.imc_condicional.model;

import java.util.Scanner;

public class ImcCalculosEVerificacao {

    double imc;
    String nomeDoAluno;
    double peso;
    double altura;

    public void receberDados(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------------------");

        System.out.println("*****CALCULADORA DE IMC*****");

        System.out.println("-----------------------------------------------");

        System.out.print("Digite o nome do aluno: ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Digite o peso do aluno(em kg): ");
        peso = leitor.nextDouble();

        System.out.print("Digite a altura do aluno(em metros): ");
        altura = leitor.nextDouble();

        calcularImc();
    }
    public void calcularImc(){

        imc = peso / (altura * altura) ;

        exibirClassificaçãoDoImc();
    }
    public void exibirClassificaçãoDoImc(){


        if (imc<= 18.5){
            System.out.println(" Status: abaixo do peso");
        } else if (imc >= 18.6 && imc<=24.9) {
            System.out.println("Status: Peso ideal(Parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("STatus: Levemente acima do peso");
        }else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Status: Obsidade grau I ");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Status: Obesidade grau II(Severa) ");
        } else if (imc>= 40.0) {
            System.out.println("Obesidade III(Mórbida) ");
        }

        exibirResultadosAoUsuario();
    }

    public void exibirResultadosAoUsuario(){

        System.out.println("-----RESULTADO-----");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("IMC Calculado: " + imc);

    }
}
