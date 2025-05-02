import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[]vetora = new int[5];
        int[]vetorb = new int[5];
        int[]vetorc = new int[10];

        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetora[i] = scanner.nextInt();
        }
        System.out.println("Digite 5 números inteiros para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorb[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetorc[i] = vetora[i];
        }
        for (int i = 0; i < 5; i++) {
            vetorc[i + 5] = vetorb[i];
        }
        System.out.println("Vetor C (A + B):");
        for(int numero : vetorc) {
            System.out.print(numero + " ");
        }
        scanner.close();
        
        



    }
}
