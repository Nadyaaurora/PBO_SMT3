public class ProyektorLCD extends Proyektor {
    boolean adaRemote;
    int jumlahPortHDMI;

    ProyektorLCD(String merk, String resolusi, boolean adaRemote, int jumlahPortHDMI) {
        super(merk, resolusi);
        this.adaRemote = adaRemote;
        this.jumlahPortHDMI = jumlahPortHDMI;
    }

    void tampilkanSlide() {
        System.out.println("Proyektor " + merk + " menampilkan slide presentasi.");
    }

    void hubungkanLaptop() {
        System.out.println("Laptop dihubungkan ke proyektor " + merk + " melalui HDMI.");
    }

    void cetakInfo() {
        System.out.println("=== INFO PROYEKTOR LCD ===");
        System.out.println("Merk        : " + merk);
        System.out.println("Resolusi    : " + resolusi);
        System.out.println("Remote      : " + (adaRemote ? "Ada" : "Tidak"));
        System.out.println("Port HDMI   : " + jumlahPortHDMI);
    }
}
