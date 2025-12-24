public class Laptop extends Komputer {
    protected String jenisBaterai;

    public Laptop() {}

    public Laptop(String merk, int kecepatanProcessor, int sizeMemory, String jenisProcessor, String jenisBaterai) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor);
        this.jenisBaterai = jenisBaterai;
    }

    public void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Baterai      : " + jenisBaterai);
    }
}
