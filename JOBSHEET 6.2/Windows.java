public class Windows extends Laptop {
    private String fitur;

    public Windows() {}

    public Windows(String merk, int kecepatanProcessor, int sizeMemory, String jenisProcessor, 
                   String jenisBaterai, String fitur) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor, jenisBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        tampilLaptop();
        System.out.println("Fitur              : " + fitur);
    }
}
