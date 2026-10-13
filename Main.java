import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        System.out.println("================================");
        System.out.println("     PROGRAM DATA MAHASISWA");
        System.out.println("================================");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nData mahasiswa ke-" + (i + 1));

            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("NIM   : ");
            String nim = input.nextLine();

            double nilai;
            while (true) {
                System.out.print("Nilai : ");
                if (input.hasNextDouble()) {
                    nilai = input.nextDouble();
                    input.nextLine(); // membersihkan sisa baris setelah membaca angka

                    if (nilai >= 0 && nilai <= 100) {
                        break;
                    } else {
                        System.out.println("Nilai harus antara 0 sampai 100.");
                    }
                } else {
                    System.out.println("Input nilai harus berupa angka.");
                    input.nextLine(); // membuang input yang tidak valid
                }
            }

            daftarMahasiswa[i] = new Mahasiswa(nama, nim, nilai);
        }

        System.out.println("\n================================");
        System.out.println("       HASIL DATA MAHASISWA");
        System.out.println("================================");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
            System.out.println("Status: " + daftarMahasiswa[i].cekKelulusan());
        }

        input.close();
    }
}
