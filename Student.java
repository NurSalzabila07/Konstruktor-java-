public class Student {
    private String nama;
    private int kredit;
    private double IPK;
    private double poinKualitas;

    // Constructor
    public Student(String nama, int kredit, double IPK, double poinKualitas) {
        this.nama = nama;
        this.kredit = kredit;
        this.IPK = IPK;
        this.poinKualitas = poinKualitas;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk kredit
    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    // Setter untuk IPK
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    // Setter untuk poinKualitas
    public void setPoinKualitas(double poinKualitas) {
        this.poinKualitas = poinKualitas;
    }

    // Metode menghitung rata-rata poin
    public double rataRataPoin() {
        return poinKualitas / kredit;
    }

    // Metode menambahkan kredit dan poin kualitas
    public void tambahKredit(int kreditBaru, double poinKualitasBaru) {
        kredit += kreditBaru;
        poinKualitas += poinKualitasBaru;
        IPK = poinKualitas / kredit;

        // Menentukan poin kualitas berdasarkan nilai IPK
        if (IPK > 3.5) {
            poinKualitas = 'A';
        } else if (IPK > 2.75) {
            poinKualitas = 'B';
        } else if (IPK > 2.5){
            poinKualitas = 'C';
        } else if (IPK > 2){
            poinKualitas = 'D';
        } else {
            poinKualitas = 'E';
        }
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk kredit
    public int getKredit() {
        return kredit;
    }

    // Getter untuk IPK
    public double getIPK() {
        return IPK;
    }

    // Getter untuk Poin Kualitas
    public char getPoinKualitas() {
        return (char) poinKualitas;
    }
}