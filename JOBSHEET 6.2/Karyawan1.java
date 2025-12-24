public class Karyawan1 {
    protected String nama, alamat, jk;
    protected int umur, gaji;

    public Karyawan1(){

    }
    public Karyawan1(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("Nama          = " + nama);
        System.out.println("Alamat        = " + alamat);
        System.out.println("Jenis Kelamin = " + jk);
        System.out.println("Umur          = " + umur);
        System.out.println("Gaji          = " + gaji);
    }
}
