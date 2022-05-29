package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campe�o: ");
		System.out.println("nome");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Champion champion1 = new Champion(name, life, attack, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campe�o: ");
		System.out.println("nome");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		Champion champion2 = new Champion(name, life, attack, armor);

		System.out.println();
		System.out.println("Quantos turnos voc� deseja executar? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);

			System.out.printf("\nResultado do turno: %d\n", i + 1);
			System.out.println(champion1.status());
			System.out.println(champion2.status());

			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				break;
			}
		}

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();

	}

}
