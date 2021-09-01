package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product();
		
	
		System.out.print("Produto: ");
		//Atributo da class product
		product.nome= sc.nextLine();
		//Atributo da class product
		System.out.print("Valor UN: ");
		
		product.preco=sc.nextDouble();
		System.out.print("Quantidade: ");
		product.quantidade=sc.nextInt();
		
		
		System.out.println(product.toString());
		System.out.print("qual a quantidade a ser add ao stock?");
		int quantidade = sc.nextInt();
		product.addproduto(quantidade);
		System.out.println(product.toString());
		System.out.print("qual a quantidade a ser retirado do stock?");
		int quantidade1 = sc.nextInt();
		product.removerProduto(quantidade1);
		
		System.out.println("entre product data: " + product.toString());
		
		sc.close();

	}

}
