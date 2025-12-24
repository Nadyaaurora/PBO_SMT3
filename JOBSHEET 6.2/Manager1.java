public class Manager1 extends Karyawan1 {
    public int tunjangan;

    public Manager1(){
        
    }

    public void tampilkanDataManager() {
        super.tampilkanDataKaryawan();
        System.out.println("Tunjangan     = " + tunjangan);
        System.out.println("Total Gaji    = " +(super.gaji+tunjangan));
    }
}