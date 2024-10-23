import java.util.Scanner;

public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int N = sc.nextInt();
        int i = 0;

        // Salah
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }

        // Benar
        // while (i < N) {
        //     int j = 0;
        //     while (j < i + 1) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        sc.close();
    }
}
