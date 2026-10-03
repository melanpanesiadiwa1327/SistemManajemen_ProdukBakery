import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ProdukBakery[] daftarProduk = new ProdukBakery[10];

        daftarProduk[0] = new Roti("Roti Cokelat", 8000, 10, "Cokelat");
        daftarProduk[1] = new Donat("Donat Keju", 7000, 15, "Keju");
        daftarProduk[2] = new Kue("Brownies", 25000, 5, "Sedang");

        int jumlah = 3;
        int pilihan;

        while (true) {

            System.out.println("\n=== SISTEM MANAJEMEN PRODUK BAKERY ===");
            System.out.println("1. Tampilkan Produk");
            System.out.println("2. Cari Produk");
            System.out.println("3. Tambah Produk");
            System.out.println("4. Jumlah Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nProduk ke-" + (i + 1));
                        daftarProduk[i].tampilkanInfo();
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nama produk: ");
                    String namaCari = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < jumlah; i++) {
                        if (daftarProduk[i].cari(namaCari)) {
                            daftarProduk[i].tampilkanInfo();
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;

                case 3:
                    if (jumlah >= daftarProduk.length) {
                        System.out.println("Data sudah penuh.");
                        break;
                    }

                    System.out.println("\n1. Roti");
                    System.out.println("2. Donat");
                    System.out.println("3. Kue");
                    System.out.print("Pilih jenis: ");

                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Harga: ");
                    double harga = input.nextDouble();

                    System.out.print("Stok: ");
                    int stok = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {
                        System.out.print("Rasa: ");
                        String rasa = input.nextLine();

                        daftarProduk[jumlah] =
                                new Roti(nama, harga, stok, rasa);

                        jumlah++;

                    } else if (jenis == 2) {
                        System.out.print("Topping: ");
                        String topping = input.nextLine();

                        daftarProduk[jumlah] =
                                new Donat(nama, harga, stok, topping);

                        jumlah++;

                    } else if (jenis == 3) {
                        System.out.print("Ukuran: ");
                        String ukuran = input.nextLine();

                        daftarProduk[jumlah] =
                                new Kue(nama, harga, stok, ukuran);

                        jumlah++;

                    } else {
                        System.out.println("Jenis tidak tersedia.");
                    }

                    break;

                case 4:
                    System.out.println("Jumlah produk: "
                            + ProdukBakery.getJumlahProduk());
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }
}