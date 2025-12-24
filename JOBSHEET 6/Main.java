public class Main {
    public static void main(String[] args) {

        // Membuat objek Dosen
        Dosen d1 = new Dosen("19750912", "Prof.Dr.Nadya", "Malang");
        d1.setSKS(10);  // 10 SKS

        Dosen d2 = new Dosen("19880102", "Dr. Sinta", "Surabaya");
        d2.setSKS(8);   // 8 SKS

        // Membuat daftar gaji
        DaftarGaji dg = new DaftarGaji(10);
        dg.addPegawai(d1);
        dg.addPegawai(d2);

        // Menampilkan gaji semua pegawai
        dg.printSemuaGaji();
    }
}
