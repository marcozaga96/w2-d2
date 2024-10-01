import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    HashMap<String, String> contatti = new HashMap<>();

    public void aggiungiContatto(String nome, String numero) {
        contatti.put(nome, numero);
    }

    public void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }

    public String cercaPersonaPerNome(String nome) {
        return "Nome: " + nome + " Telefono: " + contatti.get(nome);
    }

    public String cercaPersonaPerNumero(String numero) {
        return contatti.get(numero);
    }

    public void stampaContatti() {
        for (Map.Entry<String, String> list : contatti.entrySet()) {
            System.out.println("Nome: " + list.getKey() + ", Telefono: " + list.getValue());
        }
    }
}
