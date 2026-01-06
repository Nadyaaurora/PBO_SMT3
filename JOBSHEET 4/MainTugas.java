public class MainTugas {
    public static void main(String[] args) {
        Petugas p = new Petugas("P010", "Rina Wijaya");
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Pusat",
                "Jl. Gatot Subroto No. 20", p);

        Buku b1 = new Buku("978-11111", "Algoritma & Struktur Data",
                "Andi Prasetyo", 95000);
        Buku b2 = new Buku("978-22222", "Pemrograman Python", "Lia Kusuma", 87000);

        Anggota a1 = new Anggota("A010", "Dewi", "Jl. Mangga Dua No.7");
        Anggota a2 = new Anggota("A011", "Rizky", "Jl. Melati No.12");

        perpus.tambahBuku(b1, 0);
        perpus.tambahBuku(b2, 1);
        perpus.tambahAnggota(a1, 0);
        perpus.tambahAnggota(a2, 1);

        System.out.println(perpus.info());
        System.out.println(perpus.getPetugas().getNama());
    }
}


