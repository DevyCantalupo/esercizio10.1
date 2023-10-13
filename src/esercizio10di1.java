public class esercizio10di1 {
    public static int limite(int x) {
        int somma = 0;
        int valore = 1;

        while (valore < x) {
            somma += valore;
            System.out.println(somma);
            valore++;
        }
        return somma;
    }

    public static void main(String[] args) {
        int risultato = limite(10);
        System.out.println("risultato = " + risultato);
    }
}