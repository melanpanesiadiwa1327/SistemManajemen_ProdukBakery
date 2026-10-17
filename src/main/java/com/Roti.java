package com;

public class Roti extends ProdukBakery implements DapatDiskon {

    private String rasa;

    public Roti(String nama, double harga, int stok, String rasa) {
        super(nama, harga, stok);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis : Roti");
        super.tampilkanInfo();
        System.out.println("Rasa  : " + rasa);
    }

    @Override
    public void hitungMasaKadaluarsa() {
        System.out.println("-> Masa Kadaluarsa: 5 hari di suhu ruang.");
    }

    @Override
    public void terapkanDiskon(double persentase) {
        this.harga -= (this.harga * (persentase / 100));
        System.out.println("-> [DISKON] Diskon " + persentase + "% diterapkan. Harga baru: Rp" + this.harga);
    }
}