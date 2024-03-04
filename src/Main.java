import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("ESERCIZIO 1");

        System.out.println("Inserisci il primo numero");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il secondo numero");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("IL RISULTATO DELLA MOLTIPLICAZIONE E': " + moltiplication(num1, num2
        ));


        System.out.println("ESERCIZIO 2");
        System.out.println("Inserisci il tuo Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci la tua età: ");
        int anni = Integer.parseInt(scanner.nextLine());
        String risultato = concatenaStringa(nome, anni);
        System.out.println(risultato);

        System.out.println("ESERCIZIO 3");
        String[] arrayInput = new String[5];
        System.out.println("Inserisci cinque stringhe:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arrayInput[i] = scanner.nextLine();
        }
        System.out.println("INSERISCI UNA NUOVA STRINGA: ");
        String stringaAggiuntiva = scanner.nextLine();
        String[] arrayModificato = creaNuovoArray(arrayInput, stringaAggiuntiva);

        System.out.println("ARRAY ORIGINALE: " + Arrays.toString(arrayInput));
        System.out.println("STRINGA AGGIUNTIVA: " + stringaAggiuntiva);
        System.out.println("ARRAY MODIFICATO: " + Arrays.toString(arrayModificato));
        System.out.println("ESERCIZIO 4");
        System.out.print("Inserisci la prima stringa: ");
        String primaStringa = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String secondaStringa = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String terzaStringa = scanner.nextLine();

        // Concatenare le stringhe in ordine di inserimento
        String concatenazioneOrdinaria = primaStringa + " " + secondaStringa + " " + terzaStringa;

        // Concatenare le stringhe in ordine inverso
        String concatenazioneInversa = terzaStringa + " " + secondaStringa + " " + primaStringa;

        // Stampo i risultati
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneOrdinaria);
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);

        System.out.println("ESERCIZIO 5");

        System.out.println("INSERISCI LA BASE DEL RETTANGOLO: ");
        double base = scanner.nextDouble();

        System.out.println("INSERISCI L'ALTEZZA DEL RETTANGOLO: ");
        double altezza = scanner.nextDouble();
        double perimetro = perimetroRettangolo(base, altezza);
        System.out.println("IL PERIMETRO DEL RETTANGOLO E': " + perimetro);

        System.out.println("ESERCIZIO 6");

        System.out.println("INSERISCI UN NUMERO E TI DIRO' SE E' PARI O DISPARI");
        int numero = scanner.nextInt();

        boolean pariOdispari = controlloPariODispari(numero);

        int valoreIntero = pariOdispari ? 0 : 1;
        String risultatoBooleano = pariOdispari ? "VERO" : "FALSO";

        System.out.println("Il numero è pari? " + risultatoBooleano);
        System.out.println("Valore intero: " + valoreIntero);

        System.out.println("ESERCIZIO 7");
        double lato1 = 5.2;
        double lato2 = 7.3;
        double lato3 = 9.1;

        double areaTriangolo = areaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + areaTriangolo);
    }

    public static int moltiplication(int num1, int num2) {
        return num1 * num2;

    }

    private static String[] creaNuovoArray(String[] input, String stringaAggiuntiva) {
        if (input.length != 5) {
            throw new Error("L'array non contiene 5 elementi");

        } else {

            String[] output = new String[6];
            // COPIAMO I PRIMI 2 ELEMENTI ([0] [1])
            output[0] = input[0];
            output[1] = input[1];

            // AGGIUNGIAMO L'ELEMENTO IN TERZA POSIZIONE ([2])
            output[2] = stringaAggiuntiva;

            System.arraycopy(input, 2, output, 3, 3);
            return output;
        }

    }

    public static String concatenaStringa(String nome, int anni) {
        return "Ti chiami " + nome + " e hai " + anni + " anni";
    }

    public static double perimetroRettangolo(double base, double altezza) {
        return (base + altezza) * 2;
    }

    public static boolean controlloPariODispari(int num) {
        return (num % 2 == 0);
    }

    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        double area = 2 * Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3)) / lato1;

        return area;
    }
}
