public class MainKomputer {
    public static void main(String[] args) {

        Mac mac = new Mac("Apple", 3, 16, "M1 Chip", "Lithium", "Face ID");
        Windows win = new Windows("Asus", 4, 8, "Intel i7", "Li-Ion", "Touchscreen");
        Pc pc = new Pc("Lenovo", 3, 16, "AMD Ryzen 5", 24);

        System.out.println("=== DATA MAC ===");
        mac.tampilMac();

        System.out.println("\n=== DATA WINDOWS ===");
        win.tampilWindows();

        System.out.println("\n=== DATA PC ===");
        pc.tampilPc();
    }
}
