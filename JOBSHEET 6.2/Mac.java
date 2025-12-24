public class Mac extends Laptop {
    private String security;

    public Mac() {}

    public Mac(String merk, int kecepatanProcessor, int sizeMemory, String jenisProcessor, String jenisBaterai, String security) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor, jenisBaterai);
        this.security = security;
    }

    public void tampilMac() {
        tampilLaptop();
        System.out.println("Security           : " + security);
    }
}
