public class Croissant extends ProdukBakery {

    private String isian;

    public Croissant(String nama, double harga, int stok, String isian) {
        super(nama, harga, stok);
        this.isian = isian;
    }

    public String getIsian() {
        return isian;
    }

    public void setIsian(String isian) {
        this.isian = isian;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis  : Croissant");
        super.tampilkanInfo();
        System.out.println("Isian  : " + isian);
    }
}