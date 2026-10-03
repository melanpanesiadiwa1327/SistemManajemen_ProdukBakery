public class Roti extends ProdukBakery {

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
}