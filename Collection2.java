package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		
		int op;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			
			System.out.println("\n------------------------------------");
			System.out.println("\n\t\tMenu de opções do estoque: ");
			System.out.println("\n(1) Deseja adicionar os produtos no estoque? ");
			System.out.println("\n(2) Deseja remover os produtos do estoque? ");
			System.out.println("\n(3) Deseja atualizar os produtos do estoque?");
			System.out.println("\n(4) Deseja mostar todos os produtos em estoque?");
			System.out.println("\n(0) Deseja encerrrar o programa?");
			System.out.println("\n Escolha uma das opções:");
			op = scan.nextInt();
			System.out.println("\n---------------------------------------");
			
			switch(op) {
			
			case 1:
				
				scan.nextLine();
				System.out.println("\n Digite o produto que será adicionado:  ");
				String produto = scan.nextLine();
				estoque.add(produto);
				
				break;
			
			case 2:
				
				scan.nextLine();
				System.out.println("\n Digite o produto que será removido: ");
				String produto1 = scan.nextLine();
				
				if(estoque.contains(produto1)){
					estoque.remove(produto1);
				
				}else {
					System.out.println("\n O produto não existe em estoque!");
				}
				
				break;
			
			case 3:
				
				scan.nextLine();
				System.out.println("\n Digite o produto que irá atualizar: ");
				String verifica= scan.nextLine();
				System.out.println("\n Digite o produto irá susbtituir: " + verifica + " ");
				String novo= scan.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				
				}else{
					System.out.println("\n Esse produto não existe no estoque!");
				}
				
				break;
			
			case 4:
				
				scan.nextLine();
				System.out.println("\n Os produtos do estoque são: ");
				System.out.println(estoque);
				
				break;
			
			case 0:
				
				System.out.println("\n Muito obrigada, até a próxima !");
				
				break;
			
			default:
					
				System.out.println("\n Opção inválida !!!\n Tente novamente: ");
					
			}
			
		} while (op != 0);
	}
}
