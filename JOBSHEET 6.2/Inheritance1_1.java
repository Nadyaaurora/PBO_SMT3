public class Inheritance1_1 {
    public static void main(String[] args) {
        Manager1 M = new Manager1();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "PErempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilkanDataManager();

        Staff1 S = new Staff1();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji =2000000;
        S.lembur =500000;
        S.potongan = 250000;
        S.tampilDataStaff();
    }
}
