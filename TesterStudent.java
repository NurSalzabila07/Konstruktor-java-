public class TesterStudent {
    public static void main(String[] args) {
        // Membuat objek Student
        Student student1 = new Student("Bila", 40, 3.9, 105.0);

        // Menampilkan informasi sebelum mengubah nilai atribut
        System.out.println("Sebelum mengubah nilai atribut:");
        System.out.println("Nama: " + student1.getNama());
        System.out.println("Kredit: " + student1.getKredit());
        System.out.println("IPK: " + student1.getIPK());
        System.out.println("Poin Kualitas: " + student1.getPoinKualitas());

        // Menggunakan metode "set" untuk mengubah nilai atribut
        student1.setKredit(50);
        student1.setIPK(4.0);
        student1.setPoinKualitas(120.0);

        // Menampilkan informasi setelah mengubah nilai atribut
        System.out.println("\nSetelah mengubah nilai atribut:");
        System.out.println("Kredit: " + student1.getKredit());
        System.out.println("IPK: " + student1.getIPK());
        System.out.println("Poin Kualitas: " + student1.getPoinKualitas());
    }
}