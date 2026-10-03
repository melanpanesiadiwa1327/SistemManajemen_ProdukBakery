public class Donat extends ProdukBakery {

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
}