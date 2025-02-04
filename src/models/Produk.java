package models;

public class Produk{
    private String nama;
    private String merek;
    private String jenis;
    private double harga;
    private String deskripsi;
    private int stok;

    public Produk (String nama, String merek, String jenis, double harga, String deskripsi, int stok) {
        this.nama = nama;
        this.merek = merek;
        this.jenis = jenis;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.stok = stok;
    }

    public String getName() {
        return nama;
    }

    public String getBrand() {
        return merek;
    }

    public String getType() {
        return jenis;
    }

    public double getPrice() {
        return harga;
    }

    public String getDescription() {
        return deskripsi;
    }

    public int getStock() {
        return stok;
    }

    public void setStock(int stok) {
        this.stok = stok;
    }

    public void updateDetails(String nama, String merek, String jenis, double harga, String deskripsi, int stok) {
        this.nama = nama;
        this.merek = merek;
        this.jenis = jenis;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Merek: " + merek + ", Jenis: " + jenis +
               ", Harga: Rp " + harga + ", Stok: " + stok + ", Deskripsi: " + deskripsi;
    }
}