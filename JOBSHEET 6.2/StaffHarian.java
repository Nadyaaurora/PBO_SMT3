public class StaffHarian extends Staff {
    public int jmlJamKerja;
    public int upahPerJam;

    public StaffHarian(){

    }

    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji,
        int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilkanStaffHarian() {
        System.out.println("===========================Data Staff Harian===============================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja  = " + jmlJamKerja);
        System.out.println("Total Gaji Bersih = " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
