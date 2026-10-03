public class ProdukBakery {
    
    private String nama;
    private double harga;
    private int stok;

    private static int jumlahProduk = 0;

    public ProdukBakery(String nama, double harga, int stok) {
        this.nama = nama;
        setHarga(harga);
        setStok(stok);
        jumlahProduk++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        }
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok  : " + stok);
    }

    public static int getJumlahProduk() {
        return jumlahProduk;
    }

    public boolean cari(String nama) {
        return this.nama.equalsIgnoreCase(nama);
    }

    public boolean cari(double harga) {
        return this.harga == harga;
    }
}