import java.util.Scanner;

public class RataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs, i = 1;
        float totalNilai, rataNilai;

        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}