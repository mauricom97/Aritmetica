import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
		int n1;  // primeiro número solicitado
		int n2;  // segundo número solicitado
		int soma;  // soma dos dois números
		int sub;
		int mult;
		float divi;
		
		// Pedir 2 números para o usuário
		// Cria um objeto de Scanner que lê
		// da entrada padrão (System.in);
		Scanner entrada = new Scanner(System.in);
		// Carregar esses números como inteiros
		System.out.print("Insira o 1º número: ");
		n1 = entrada.nextInt();


        System.out.print("Insira o 2º número: ");
                n2 = entrada.nextInt();
                
                // Somar os dois números
                soma = n1 + n2;

				//Subtração
				sub = n1 - n2;

				//multiplicacao
				mult = n1 * n2;

				//Divisao
				divi = n1 / n2;
				
				//Pegando maior
				if(n1 > n2){
					System.out.printf("Maior numero: %d\n", n1);
				}else if(n1 < n2){
					System.out.printf("Maior numero: %d\n", n2);
				}else{
					System.out.printf("Numeros iguais %d\n", n2);
				}

                // Imprimir a soma
                System.out.printf("Soma: %d\n", soma);

				System.out.printf("Subtração: %d\n", sub);

				System.out.printf("Multiplicação: %d\n", mult);

				System.out.printf("Divisão: %f\n", divi);


            }
        }