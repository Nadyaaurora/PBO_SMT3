public class Komputer {
    protected String merk;
    protected int kecepatanProcessor;
    protected int sizeMemory;
    protected String jenisProcessor;

    public Komputer() {}

    public Komputer(String merk, int kecepatanProcessor, int sizeMemory, String jenisProcessor) {
        this.merk = merk;
        this.kecepatanProcessor = kecepatanProcessor;
        this.sizeMemory = sizeMemory;
        this.jenisProcessor = jenisProcessor;
    }

    public void tampilData() {
        System.out.println("Merk               : " + merk);
        System.out.println("Kecepatan CPU      : " + kecepatanProcessor + " GHz");
        System.out.println("Memory             : " + sizeMemory + " GB");
        System.out.println("Processor          : " + jenisProcessor);
    }
}
