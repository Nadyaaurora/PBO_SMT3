// Kelas Mobil
class Mobil {
    String merk;
    String warna;
    int kecepatan;

    void mulaiMesin() {
        System.out.println("Mesin mobil " + merk + " dinyalakan.");
    }

    void jalan() {
        System.out.println("Mobil berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }
}

// Kelas Pengemudi
class Pengemudi {
    String nama;
    String sim;
    Mobil mobil;        // hubungan: Pengemudi memiliki Mobil

    void mulaiMengemudi() {
        System.out.println(nama + " mulai mengemudi mobil.");
        mobil.mulaiMesin();
    }

    void percepatMobil(int tambah) {
        mobil.kecepatan += tambah;
        System.out.println(nama + " menambah kecepatan menjadi " + mobil.kecepatan + " km/jam.");
    }
}

// Kelas Rute
class Rute {
    String asal;
    String tujuan;
    int jarak;

    void infoRute() {
        System.out.println("Rute dari " + asal + " ke " + tujuan +
                           " dengan jarak " + jarak + " km.");
    }
}

// Main Program
public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merk = "Toyota";
        m.warna = "Hitam";
        m.kecepatan = 0;

        Pengemudi p = new Pengemudi();
        p.nama = "Budi";
        p.sim = "SIM A";
        p.mobil = m;

        Rute r = new Rute();
        r.asal = "Malang";
        r.tujuan = "Surabaya";
        r.jarak = 90;

        p.mulaiMengemudi();
        p.percepatMobil(40);
        r.infoRute();
    }
}
