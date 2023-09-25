public class BangunRuangTester {
    public static void main(String[] args) {
        BangunRuang balok = new BangunRuang();

        balok.setLebar(5);
        balok.setPanjang(15);
        balok.setTinggi(8);

        int Lebar = balok.getLebar();
        int Panjang = balok.getPanjang();
        int Tinggi = balok.getTinggi();

        System.out.println(balok.getLebar()* balok.getPanjang()* balok.getTinggi());
    }
}