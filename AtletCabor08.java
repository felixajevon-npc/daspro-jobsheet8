import java.util.Scanner;

public class AtletCabor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaAtlet;
        int jumlahPoliteknik, jumlahAtlet = 5;
        String[] cabangOlahraga = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("\nCabang Olahraga: " + cabangOlahraga[i]);

            for (int j = 1; j <= jumlahPoliteknik; j++) {
                System.out.print("Masukkan nama atlet untuk politeknik ke-" + j + ": ");
                namaAtlet = sc.nextLine();
                System.out.println("Atlet ke-" + j + " untuk " + cabangOlahraga[i] + ": " + namaAtlet);
            }
        }

        sc.close();
    }
}
