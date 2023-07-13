public class Aksi {
    public static void main(String[] args) {

        Indihome indihome1 = new Indihome();
        indihome1.paket = "Paket Indihome 1";
        indihome1.harga = 280000;
        indihome1.kecepatan = 30;

        Indihome indihome2 = new Indihome();
        indihome2.paket = "Paket Indihome 2";
        indihome2.harga = 310000;
        indihome2.kecepatan = 40;

        Indihome indihome3 = new Indihome();
        indihome3.paket = "Paket Indihome 3";
        indihome3.harga = 350000;
        indihome3.kecepatan = 50;

        System.out.println("List Harga Paket Indihome (1P Internet Only)");
        System.out.println();
        indihome1.info();
        System.out.println("Harga Setelah PPN 11%: " + (indihome1.harga + (indihome1.harga * 0.11)));
        System.out.println();

        indihome2.info();
        System.out.println("Harga Setelah PPN 11%: " + (indihome2.harga + (indihome2.harga * 0.11)));
        System.out.println();

        indihome3.info();
        System.out.println("Harga Setelah PPN 11%: " + (indihome3.harga + (indihome3.harga * 0.11)));
    }
}