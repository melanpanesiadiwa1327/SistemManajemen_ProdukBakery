package com;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ProdukBakery[] daftarProduk = new ProdukBakery[10];

        daftarProduk[0] = new Roti("Roti Cokelat", 8000, 10, "Cokelat");
        daftarProduk[1] = new Donat("Donat Keju", 7000, 15, "Keju");
        daftarProduk[2] = new Kue("Brownies", 25000, 5, "Sedang");
        daftarProduk[3] = new Croissant("Croissant Cokelat", 12000, 8, "Cokelat");

        int jumlah = 4;
        int pilihan;

        while (true) {

            System.out.println("\n=== SISTEM MANAJEMEN PRODUK BAKERY ===");
            System.out.println("1. Tampilkan Produk");
            System.out.println("2. Cari Produk");
            System.out.println("3. Tambah Produk");
            System.out.println("4. Jumlah Produk");
            System.out.println("5. Simulasi Produk");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nProduk ke-" + (i + 1));
                        daftarProduk[i].tampilkanInfo();

                        daftarProduk[i].hitungMasaKadaluarsa();

                        if (daftarProduk[i] instanceof DapatDiskon) {
                            DapatDiskon itemDiskon = (DapatDiskon) daftarProduk[i];
                            itemDiskon.terapkanDiskon(10);
                        }

                        if (daftarProduk[i] instanceof DapatDipesan) {
                            DapatDipesan itemPesan = (DapatDipesan) daftarProduk[i];
                            itemPesan.prosesPesanan(5);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== CARI PRODUK ===");
                    System.out.println("1. Cari berdasarkan nama");
                    System.out.println("2. Cari berdasarkan harga");
                    System.out.print("Pilih: ");

                    int jenisCari = input.nextInt();
                    input.nextLine();

                    boolean ditemukan = false;

                    if (jenisCari == 1) {
                        System.out.print("Masukkan nama produk: ");
                        String namaCari = input.nextLine();

                        for (int i = 0; i < jumlah; i++) {
                            if (daftarProduk[i].cari(namaCari)) {
                                daftarProduk[i].tampilkanInfo();
                                ditemukan = true;
                            }
                        }

                    } else if (jenisCari == 2) {
                        System.out.print("Masukkan harga produk: ");
                        double hargaCari = input.nextDouble();
                        input.nextLine();

                        for (int i = 0; i < jumlah; i++) {
                            if (daftarProduk[i].cari(hargaCari)) {
                                daftarProduk[i].tampilkanInfo();
                                ditemukan = true;
                            }
                        }

                    } else {
                        System.out.println("Pilihan tidak tersedia.");
                        break;
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

                    System.out.println("\n=== TAMBAH PRODUK ===");
                    System.out.println("1. Roti");
                    System.out.println("2. Donat");
                    System.out.println("3. Kue");
                    System.out.println("4. Croissant");
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

                    } else if (jenis == 4) {

                        System.out.print("Isian: ");
                        String isian = input.nextLine();

                        daftarProduk[jumlah] =
                                new Croissant(nama, harga, stok, isian);

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
                    System.out.println("\n=== SIMULASI PRODUK ===");
                    System.out.print("Pilih nomor produk (1-" + jumlah + "): ");

                    int nomor = input.nextInt();
                    input.nextLine();

                    if (nomor >= 1 && nomor <= jumlah) {
                        daftarProduk[nomor - 1]
                                .prosesProduk(daftarProduk[nomor - 1]);
                    } else {
                        System.out.println("Nomor produk tidak tersedia.");
                    }

                    break;

                case 6:
                    System.out.println("Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }
}