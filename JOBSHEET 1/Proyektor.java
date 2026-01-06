public class Proyektor {
    String merk;
    String resolusi;

    Proyektor(String merk, String resolusi) {
        this.merk = merk;
        this.resolusi = resolusi;
    }

    void nyalakan() {
        System.out.println("Proyektor " + merk + " dinyalakan.");
    }

    void matikan() {
        System.out.println("Proyektor " + merk + " dimatikan.");
    }

    void cetakInfo() {
        System.out.println("=== INFO PROYEKTOR ===");
        System.out.println("Merk     : " + merk);
        System.out.println("Resolusi : " + resolusi);
    }
}
