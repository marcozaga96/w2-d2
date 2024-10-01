public class Main3 {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.aggiungiContatto("marco", "123");
        rubrica.aggiungiContatto("luca", "456");
        rubrica.aggiungiContatto("giuseppe", "789");

        System.out.println("----------------stampa tutti i contatti---------------");
        rubrica.stampaContatti();
        System.out.println("------------------stampa tutti i contatti senza quello rimosso------------------");
        rubrica.rimuoviContatto("marco");
        rubrica.stampaContatti();
        System.out.println("stampa tutti i contatti di nome giuseppe: " + rubrica.cercaPersonaPerNome("giuseppe"));

        System.out.println("------------------stampa tutti i contatti con il numero 456----------------------" + rubrica.cercaPersonaPerNumero("456"));

    }
}
