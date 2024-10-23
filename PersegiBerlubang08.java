import java.util.Scanner;

public class PersegiBerlubang08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Masukkan ukuran N (minimal 3): ");
            N = scanner.nextInt();
            if (N >= 3) {
                break; 
            }
            System.out.println("Ukuran N harus minimal 3. Silakan coba lagi.");
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N); 
                } else {
                    System.out.print(" "); 
                }
                if (j < N - 1) {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
        scanner.close(); 
    }
}
