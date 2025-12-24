public class Manager extends Karyawan {
    public int tunjangan;

    public Manager(){
        
    }

    public void tampilkanDataManager() {
        super.tampilkanDataKaryawan();
        System.out.println("Tunjangan      = " + tunjangan);
        System.out.println("Total Gaji     = " +(super.gaji+tunjangan));
    }
}
