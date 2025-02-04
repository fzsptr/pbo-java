package controllers;

import java.util.ArrayList;
import java.util.List;
import models.*;

public class AdminController {
    private List<Produk> produks;
    private List<Penyewaan> rentals;

    public AdminController() {
        produks = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addProduk(String nama, String merek, String jenis, double harga, String deskripsi, int stok) {
        Produk newProduct = new Produk(nama, merek, jenis, harga, deskripsi, stok);
        produks.add(newProduct);
        System.out.println("Produk berhasil ditambah: " + newProduct);
    }
    public void addRental(Penyewaan rental) {
        rentals.add(rental);
        System.out.println("Penyewaan berhasil ditambahkan:\n" + rental);
    }
    public void deleteProduk(String namaProduk) {
        produks.removeIf(produk -> produk.getName().equalsIgnoreCase(namaProduk));
    }
    public List<Produk> getAllProduk() {
        return produks;
    }

    public List<Produk> getProdukList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdukList'");
    }
}