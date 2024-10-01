import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (true) {
            try {
                System.out.print("Inserisci il numero di parole: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException("Il numero deve essere positivo.");
                }
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Errore: devi inserire un numero intero.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();
        System.out.println("inserisci le parole");

        for (int i = 0; i < n; i++) {
            String parola = scanner.nextLine();
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }
        System.out.println("parole duplicate:" + paroleDuplicate);
        System.out.println("numero di parole distinte:" + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte:" + paroleDistinte);
    }
}