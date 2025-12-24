public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Sudut ke-3: " + s.totalSudut(60));
        System.out.println("Sudut ke-3: " + s.totalSudut(60, 50));
        System.out.println("Keliling segitiga: " + s.keliling(3, 4, 5));
        System.out.println("Keliling segitiga siku-siku: " + s.keliling(3.0, 4.0));
    }
}
