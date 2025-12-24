public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
        index = 0;
    }

    public void addPegawai(Pegawai p) {
        listPegawai[index] = p;
        index++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama());
            System.out.println("Gaji: " + listPegawai[i].getGaji());
            System.out.println("----------------------");
        }
    }
}
