package nasa2;

import java.util.Scanner;

public class Sistema {

	Scanner sc = new Scanner(System.in);

	int opcaoprincipal;

	public void menuPrincipal() {
		int opcaoprincipal;
		System.out.println("\n\nSelecione a forma geográfica: ");
		System.out.println("\n1-Quadrado");
		System.out.println("2-Retângulo");
		System.out.println("3-Triângulo");
		System.out.println("4-Circulo");
		System.out.println("9-Sair");
		opcaoprincipal = sc.nextInt();
		this.opcaoprincipal = opcaoprincipal;

		switch (opcaoprincipal) {
		case 1:
			this.menuSecundario();
		case 2:
			this.menuSecundario();
		case 3:
			this.menuSecundario();
		case 4:
			this.menuSecundario();

		case 9:
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}
		this.menuPrincipal();
	}

	private void menuSecundario() {

		int opcao;
		System.out.println("\n1-Rotacionar");
		System.out.println("2-Aumentar");
		System.out.println("3-Diminuir");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			if (opcaoprincipal == 3 || opcaoprincipal == 4) {
				System.out.println("Não é possível rotacionar com essas formar geométricas");
			} else {
				System.out.println("Rotacionado");
			}
			
			break;
		case 2:
			if (opcaoprincipal == 1 || opcaoprincipal == 2) {
				System.out.println("Não é possível aumentar com essas formar geométricas");
			} else {
				System.out.println("Aumentado");
			}
			
			break;
		case 3:
			if (opcaoprincipal == 1 || opcaoprincipal == 2) {
				System.out.println("Não é possível diminuir com essas formar geométricas");
			} else {
				System.out.println("Diminuido");
			}
			
			break;

		case 9:
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}
		this.menuPrincipal();
	}

}
