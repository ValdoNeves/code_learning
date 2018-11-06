package fibonacci;
import java.util.Scanner;

public class fibonacci {
	public static void main(String [] args) {
		
		//scanner coletando dados do teclado
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos numeros da sequencia de fibonacci você quer ver? ");
		int numero = scan.nextInt();
		//teste da entrada do teclado
		System.out.println(numero);
		
		//variaveis inicializadas
		int first = 0;
		int second = 1;
		
		//Condições sobre o dado coletado
		
		if(numero <= 1) {
			//caso o valor seja pequeno não vale apena ser mostrado
			System.out.println(numero + " é um valor baixo não irá gerar uma sequencia satisfatoria");
		}
		else if (numero > 101 ) {
			//valores muitos altos podem deixar o sistema lento
			System.out.println(numero + " é um valor muito grande, pode deixar o sistema lento.");
		}
		else if(numero == 2) {
			System.out.println("0 -> 1");
		}else {
			System.out.print("0 -> 1");
			//retira dois da variavel para não exibir numeros a mais
			numero -= 2;
			while ( numero > 0) {
				int third = first + second;
				System.out.print(" -> "+ third);
				//movendo variaveis pela sequencia
				first = second;
				second = third;
				numero -= 1;
			}
			System.out.print(" -> fim!");
		}
		
	}
}
