package domaci;

public class PrviDomaci {

	public static void main(String[] args) {
		int a = 242;
        int b = 12;

        char operation = '+';

        switch (operation) {
            case '+':
                int suma = a + b;
                System.out.println("Zbir brojeva " + a + " i " + b + " je: " + suma);
                break;

            case '-':
                int razlika = Math.max(a, b) - Math.min(a, b);
                System.out.println("Razlika (veći - manji) je: " + razlika);
                break;

            case '*':
                int proizvod = a * b;
                System.out.println("Proizvod brojeva " + a + " i " + b + " je: " + proizvod);
                break;

            case '/':
                if (b != 0) {
                    int kolicnik = a / b;
                    System.out.println("Količnik brojeva " + a + " i " + b + " je: " + kolicnik);
                } else {
                    System.out.println("Deljenje sa nulom nije dozvoljeno.");
                }
                break;

            default:
                System.out.println("Uneta je nevažeća operacija.");
                break;
        }
	}

}
