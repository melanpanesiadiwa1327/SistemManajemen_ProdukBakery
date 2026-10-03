public class Kue extends ProdukBakery {

    private String ukuran;

    public Kue(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis  : Kue");
        super.tampilkanInfo();
        System.out.println("Ukuran : " + ukuran);
    }
}