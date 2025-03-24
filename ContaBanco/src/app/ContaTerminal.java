package app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		System.out.print("Por favor, digite o número da Agência: ");
		numero = scanner.nextInt();
		
		System.out.print("Por favor, digite a Agência: ");
		scanner.nextLine();
		agencia = scanner.nextLine();
		
		System.out.print("Por favor, digite o nome do Cliente: ");
		nomeCliente = scanner.nextLine();
		
		System.out.print("Por favor, digite o saldo: ");
		saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ "" + agencia + " , conta " + numero + " e seu saldo " +  String.format("%.2f", saldo) + " já está disponível para saque!");
		
		scanner.close();
	}

}
