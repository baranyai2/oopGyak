import java.util.Scanner;


public class Kalkulator {

	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Kerem az elso operandus erteket!");
		double elso_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem az masodik operandus erteket!");
		double masodik_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem az operatort!");
		System.out.print("Az operator: ");
		String operator = bemenet.next();
		
		
		double eredmeny = 0;
		
		switch (operator) {
		case "+":
			eredmeny = elso_operandus + masodik_operandus;
			System.out.println("Az eredmeny: " + eredmeny);
			eredmeny = 0;
			break;
		case "-":
			eredmeny = elso_operandus - masodik_operandus;
			System.out.println("Az eredmeny: " + eredmeny);
			eredmeny = 0;
			break;
		case "*":
			eredmeny = elso_operandus * masodik_operandus;
			System.out.println("Az eredmeny: " + eredmeny);
			eredmeny = 0;
			break;
		case "/":
			if (masodik_operandus != 0) {
				eredmeny = elso_operandus / masodik_operandus;
				System.out.println("Az eredmeny: " + eredmeny);
				eredmeny = 0;
			} else {
				System.out.println("Ne akarj nullaval osztani...");
			}
			break;

		default:
			break;
		}
		
		/*System.out.println("Kerem adja meg a kiszamitando kifejezst: ");
		String kifejezes = bemenet.nextLine();
		kifejezes = bemenet.nextLine();
		
		String[] tomb = kifejezes.split(" ");
		elso_operandus = Double.parseDouble(tomb[0]);
		masodik_operandus = Double.parseDouble(tomb[2]);
		operator = tomb[1];
		
		System.out.println(elso_operandus);
		System.out.println(masodik_operandus);
		System.out.println(operator);*/
		
		bemenet.close();
	}

}
