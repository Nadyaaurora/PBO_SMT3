package TUGAS;
public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public double hargaSewa;
    public int lamaSewa;

    public double hitungHarga() {
        return lamaSewa * hargaSewa;
    }

    public void tampilData() {
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga Sewa    : Rp" + hargaSewa);
        System.out.println("Total Bayar   : Rp" + hitungHarga());
        System.out.println("-----------------------------");
    }
}
