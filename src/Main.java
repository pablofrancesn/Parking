import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		Coche[] coches = new Coche[5];

		for (int i = 0; i < coches.length; i++) {
			System.out.print("Introduzca matrícula: ");
			String license = sc.nextLine();
			System.out.print("Introduzca marca: ");
			String brand = sc.nextLine();
			System.out.print("Introduzca modelo: ");
			String model = sc.nextLine();
			System.out.print("Introduzca color: ");
			String color = sc.nextLine();
			coches[i] = new Coche(license, brand, model, color);
		}
		for (int i = 0; i < coches.length; i++) {
			System.out.println("Coche " + (i + 1) + " --> " + coches[i].datos());
		}
		for (int i = 1; i < coches.length; i++) {
			System.out.println(coches[i].getLicense());
			i++;
		}
		for (int i = 0; i < coches.length; i++) {
			if (coches[i].getBrand().equalsIgnoreCase("Audi")) {
				coches[i].setColor("Verde");
			}
		}
	}

}
