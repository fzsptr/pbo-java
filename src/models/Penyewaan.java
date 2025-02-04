package models;

import java.util.*;

public class Penyewaan {
    private String customerName;  // Nama penyewa
    private List<Produk> items; // Daftar produk yang disewa
    private String rentDate;     // Tanggal sewa
    private String returnDate;   // Tanggal pengembalian
    private String status;       // Status penyewaan: "Diantar", "Aktif", "Selesai", dll.
    private double totalCost;    // Total biaya penyewaan

    public Penyewaan(String customerName, String rentDate, String returnDate) {
        this.customerName = customerName;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.items = new ArrayList<>();
        this.status = "Aktif";
        this.totalCost = 0;
    }

    // Getter dan Setter
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Produk> getItems() {
        return items;
    }

    public void addItem(Produk produk) {
        this.items.add(produk);
        this.totalCost += produk.getPrice();
        // Tambahkan harga produk ke total biaya
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    // Override untuk menampilkan informasi penyewaan
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Penyewaan oleh: ").append(customerName).append("\n");
        sb.append("Tanggal Sewa: ").append(rentDate).append("\n");
        sb.append("Tanggal Pengembalian: ").append(returnDate).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Total Biaya: ").append(totalCost).append("\n");
        sb.append("Daftar Item:\n");
        for (Produk item : items) {
            sb.append("- ").append(item.getName()).append("\n");
        }
        return sb.toString();
    }
}
