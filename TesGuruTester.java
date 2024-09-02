import java.util.Scanner;

public class TesGuruTester {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Nama: ");
        // String nama = input.nextLine();
        // System.out.println("Mata Pelajaran: ");
        // String mapel = input.nextLine();
        // System.out.println("Status: ");
        // String status = input.nextLine();
        // System.out.println("NIP: ");
        // int nip = input.nextInt();
        // input.close();

        TesGuru zidan = new TesGuru(nip, nama, mapel, status);
        zidan.print();
        TesGuru ilham = new TesGuru(nip, nama, mapel, status);
        ilham.print();
        TesGuru ari = new TesGuru(nip, nama, mapel, status);
        ari.print();
        TesGuru yusup = new TesGuru(nip, nama, mapel, status);
        yusup.print();
        TesGuru wahyu = new TesGuru(nip, nama, mapel, status);
        wahyu.print();

       TesGuru zidan = new TesGuru();
       TesGuru ilham = new TesGuru();
       TesGuru ari = new TesGuru();
       TesGuru yusup = new TesGuru();
       TesGuru wahyu = new TesGuru();

       zidan.nip = 1111;
       zidan.nama = "Pak Zidan";
       zidan.mapel = "Bahasa Inggris";
       zidan.mapel = "Full-Time";
       ilham.nip = 1112;
       ilham.nama = "Pak Ilham";
       ilham.mapel = "Olah Raga";
       ilham.mapel = "Tetap";
       ari.nip = 1123;
       ari.nama = "Pak Ari";
       ari.mapel = "Bahasa Jawa";
       ari.mapel = "Part-Time";
       yusup.nip = 1234;
       yusup.nama = "Pak Yusuf";
       yusup.mapel = "IPA";
       yusup.mapel = "tetap";
       wahyu.nip = 2345;
       wahyu.nama = "Pak Wahyu";
       wahyu.mapel = "Matematika";
       wahyu.mapel = "Full-Time";

       zidan.print();
       ilham.print();
       ari.print();
       yusup.print();
       wahyu.print();
    }
}
