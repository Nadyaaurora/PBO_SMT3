public class PapanProyektorDemo {
    public static void main(String[] args) {
        Proyektor p1 = new Proyektor("Epson", "1080p");
        ProyektorLCD p2 = new ProyektorLCD("BenQ", "4K", true, 2);
        PapanTulis pt1 = new PapanTulis("Kayu", "2x1.5 meter");
        PapanTulisPutih pt2 = new PapanTulisPutih("Akrilik", "2x1 meter", "Spidol Boardmarker", true);

        p1.nyalakan();
        p1.cetakInfo();
        p1.matikan();

        System.out.println();

        p2.nyalakan();
        p2.tampilkanSlide();
        p2.hubungkanLaptop();
        p2.cetakInfo();
        p2.matikan();

        System.out.println();

        pt1.tulis("Pemrograman Berorientasi Objek");
        pt1.hapus();
        pt1.cetakInfo();

        System.out.println();

        pt2.tulis("Inheritance di Java");
        pt2.gantiSpidol("Merah");
        pt2.gunakanMagnet();
        pt2.cetakInfo();
    }
}