public class PapanTulis {
    String bahan;
    String ukuran;

    PapanTulis(String bahan, String ukuran) {
        this.bahan = bahan;
        this.ukuran = ukuran;
    }

    void tulis(String teks) {
        System.out.println("Menulis: " + teks);
    }

    void hapus() {
        System.out.println("Papan tulis dihapus.");
    }

    void cetakInfo() {
        System.out.println("=== INFO PAPAN TULIS ===");
        System.out.println("Bahan  : " + bahan);
        System.out.println("Ukuran : " + ukuran);
    }
}
