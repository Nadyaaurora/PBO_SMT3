class Segitiga {
    int sudut;

    int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    double keliling(double sisiA, double sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}
