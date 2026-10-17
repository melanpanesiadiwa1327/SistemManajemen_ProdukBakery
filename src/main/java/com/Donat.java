package com;

public class Donat extends ProdukBakery implements DapatDiskon, DapatDipesan {

    private String topping;

    public Donat(String nama, double harga, int stok, String topping) {
        super(nama, harga, stok);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis   : Donat");
        super.tampilkanInfo();
        System.out.println("Topping : " + topping);
    }

    @Override
    public void hitungMasaKadaluarsa() {
        System.out.println("-> Masa Kadaluarsa: 2 hari di suhu ruang.");
    }

    @Override
    public void terapkanDiskon(double persentase) {
        this.harga -= (this.harga * (persentase / 100));
        System.out.println("-> [DISKON] Diskon " + persentase + "% diterapkan. Harga baru: Rp" + this.harga);
    }

    @Override
    public void prosesPesanan(int jumlah) {
        System.out.println("-> [PESANAN] Memproses " + jumlah + " pcs donat ke dapur.");
    }
}