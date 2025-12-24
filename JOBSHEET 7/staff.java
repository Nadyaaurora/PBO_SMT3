public class staff extends karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur)
    {
        this.lembur=lembur;
    }
    public int getLembur()
    {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur)
    {
        this.gajiLembur=gajiLembur;
    }
    public double getGajiLembur()
    {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur)
    {
        return getGaji()+(lembur*gajiLembur);
    }
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }
    public void lihatInfo()
    {
        System.out.printf("NIP             : "+this.getNip());
        System.out.printf("Nama            : "+this.getNama());
        System.out.printf("Golongan        : "+this.getGolongan());
        System.out.printf("Jumlah Lembur   : "+this.getLembur());
        System.out.printf("Gaji Lembur     : %.Of\n "+this.getGajiLembur());
        System.out.printf("Gaji            : %.Of\n "+this.getGaji());
    }
}