package TUGAS;
public class TestBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode = "BRG001";
        b1.namaBarang = "Keyboard";
        b1.hargaDasar = 200000;
        b1.diskon = 0.1f; // 10%
        b1.tampilData();

        Barang b2 = new Barang();
        b2.kode = "BRG002";
        b2.namaBarang = "Mouse";
        b2.hargaDasar = 100000;
        b2.diskon = 0.2f; // 20%
        b2.tampilData();
    }
}
