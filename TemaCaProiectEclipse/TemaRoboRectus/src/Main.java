import java.util.Scanner; //i dunno bro, asa am invatat eu sa citesc din consola chestii inca din a 6-a, nust daca e o cale mai usoara

public class Main {

	public static void main(String[] args) {

		// initializam variabile
		String nume;
		int varsta;
		Scanner sc = new Scanner(System.in);

		// punem in try ca nu se stie niciodata cum vr sa testezi chestia asta
		try {

			// citim numele
			System.out.println("Buna Puuuf! Cum te numesti? ");
			nume = sc.nextLine();

			// citim varsta
			System.out.println("Pefect, " + nume + ", acum, spune lui tata pUf ce varsta ai ");
			varsta = citesteVarsta(sc);

			// verificam daca este valida varsta
			// caz mosuletz
			if (varsta > 115) {
				System.out.println("Blud, esti mort, cum se face ca folosesti acest program??? RIP " + nume + " "
						+ (2025 - varsta) + "-2025");

				// caz bebeloi
			} else if (varsta > 0 && varsta < 4) {
				System.out.println(
						"Guguuuu Gaga guga ga guuuu " + nume + " gu gu gagagaga " + varsta + " gagagu ga gu gi?");

				// caz din viitor
			} else if (varsta < 0) {
				System.out.println("Blud, urmeaza sa te nasti in " + (2025 - varsta)
						+ "; iti multumesc ca ai ales sa calatoresti in timp doar ca sa rulezi acest program lmao");

				// caz om normal
			} else {
				System.out.println("Salut, te cheama puf, ummm adica " + nume + " si ai " + varsta
						+ " ani, desi stim amandoi ca aceasta este doar un numar ;))))");

			}
			
			// deci daca reusesti sa ajungi in acest catch sa imi zici si mie ce ai facut
		} catch (Exception e) {
			System.out.println(
					"Eroare random : " + e + " Ce ai facut varule de ai ajuns aici? inafara de a intrerupe procesul");
			main(null);
		}
	}

	// functie care se asigura ca citeste un numar si nu o culoare
	private static int citesteVarsta(Scanner sc) {
		//probabil merge mai bine cu un while in loc de schema asta lol ca nu ar da stack overflow, desiiiii cn sta sa dea stress test la baitul astaaaa
		//while (true){
		//	try-catch-ul din interior
		//}
		
		// incercam sa dam varsta, daca nu e nr atragem atentia si incercam din nou.
		try {
			return Integer.parseInt(sc.nextLine());

		} catch (Exception e) {
			System.out.println("Nu puf, acela nu este un numar puf, de ce ma minti? Mai incearca");

		}
		return citesteVarsta(sc);
	}

}

