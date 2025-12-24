public class Pc extends Komputer {
    private int ukuranMonitor;

    public Pc() {}

    public Pc(String merk, int kecepatanProcessor, int sizeMemory, String jenisProcessor, int ukuranMonitor) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        tampilData();
        System.out.println("Ukuran Monitor     : " + ukuranMonitor + " inch");
    }
}
