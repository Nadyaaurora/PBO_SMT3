package TUGAS;
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        pj1.id = 1;
        pj1.namaMember = "Nadya";
        pj1.namaGame = "FIFA 24";
        pj1.hargaSewa = 30000;
        pj1.lamaSewa = 3;
        pj1.tampilData();

        Peminjaman pj2 = new Peminjaman();
        pj2.id = 2;
        pj2.namaMember = "Aurora";
        pj2.namaGame = "GTA V";
        pj2.hargaSewa = 40000;
        pj2.lamaSewa = 2;
        pj2.tampilData();
    }
}
