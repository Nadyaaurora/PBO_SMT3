public class PapanTulisPutih extends PapanTulis {
    String jenisSpidol;
    boolean adaPenghapusMagnet;

    PapanTulisPutih(String bahan, String ukuran, String jenisSpidol, boolean adaPenghapusMagnet) {
        super(bahan, ukuran);
        this.jenisSpidol = jenisSpidol;
        this.adaPenghapusMagnet = adaPenghapusMagnet;
    }

    void gantiSpidol(String warna) {
        System.out.println("Mengganti spidol menjadi warna " + warna);
    }

    void gunakanMagnet() {
        if (adaPenghapusMagnet) {
            System.out.println("Menggunakan penghapus magnet di papan tulis putih.");
        } else {
            System.out.println("Papan tulis ini tidak memiliki penghapus magnet.");
        }
    }

    void cetakInfo() {
        System.out.println("=== INFO PAPAN TULIS PUTIH ===");
        System.out.println("Bahan            : " + bahan);
        System.out.println("Ukuran           : " + ukuran);
        System.out.println("Spidol           : " + jenisSpidol);
        System.out.println("Penghapus Magnet : " + (adaPenghapusMagnet ? "Ada" : "Tidak"));
    }
}