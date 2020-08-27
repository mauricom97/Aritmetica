/*
Crie um aplicativo de calculadora IMC que leia o peso do usuário 
em kg e altura em metros e calcule e exiba o índice de massa 
corporal dele. Além disso, exiba as informações sobre IMC:

IMC = peso / (altura * altura)

Valores de IMC:
Abaixo do peso: menor que 18.5
Normal: entre 18.5 e 24.9
Sobrepeso: entre 25 e 29.9
Obeso: 30 ou maior
*/

import java.util.Scanner;
public class Imc{
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu peso: ");
		peso = entrada.nextDouble();
        System.out.print("Insira sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.printf("Abaixo do peso: %f\n", imc);
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.printf("Peso normal: %f\n", imc);
        }else if(imc >= 25 && imc <= 29.9){
            System.out.printf("Sobre peso: %f\n", imc);            
        }else if(imc > 30){
            System.out.printf("Seu obeso: %f\n", imc);  
        }

        
    }
}