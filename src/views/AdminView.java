package views;

import controllers.*;
import java.awt.*;
import javax.swing.*;
import models.*;

public class AdminView {
    private AdminController adminController;

    public AdminView(AdminController adminController) {
        this.adminController = adminController;
        createGUI();
    }

    private void createGUI() {
        JFrame frame = new JFrame("Admin Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Nama Barang:");
        JTextField nameField = new JTextField();

        JLabel brandLabel = new JLabel("Merek Barang:");
        JTextField brandField = new JTextField();

        JLabel typeLabel = new JLabel("Jenis Barang:");
        JTextField typeField = new JTextField();

        JLabel priceLabel = new JLabel("Harga Barang:");
        JTextField priceField = new JTextField();

        JLabel descriptionLabel = new JLabel("Deskripsi Barang:");
        JTextField descriptionField = new JTextField();

        JLabel stockLabel = new JLabel("Stok:");
        JTextField stockField = new JTextField();

        JButton addButton = new JButton("Tambah Produk");
        JTextArea productListArea = new JTextArea(10, 30);

        productListArea.setEditable(false);

        addButton.addActionListener(e -> {
            try {
                String nama = nameField.getText();
                String merek = brandField.getText();
                String jenis = typeField.getText();
                double harga = Double.parseDouble(priceField.getText());
                String deskripsi = descriptionField.getText();
                int stok = Integer.parseInt(stockField.getText());
                

                // Validasi Input
                if (nama.isEmpty() || merek.isEmpty() || jenis.isEmpty() || deskripsi.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua field harus diisi.");
                    return;
                }

                // Tambah daftar produk
                adminController.addProduk(nama, merek, jenis, harga, deskripsi, stok);
        
                // Kosongkan field input
                nameField.setText("");
                brandField.setText("");
                typeField.setText("");
                priceField.setText("");
                descriptionField.setText("");
                stockField.setText("");
        
                // Update daftar produk
                Penyewaan rentals = new Penyewaan("Customer Test", "2025-01-01", "2025-01-07");
                rentals.addItem(new Produk(nama, merek, jenis, harga, deskripsi, stok));
                adminController.addRental(rentals);

    
        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Silahkan cek entri.");
            }
        });
        
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(brandLabel);
        panel.add(brandField);
        panel.add(typeLabel);
        panel.add(typeField);
        panel.add(priceLabel);
        panel.add(priceField);
        panel.add(descriptionLabel);
        panel.add(descriptionField);
        panel.add(stockLabel);
        panel.add(stockField);
        panel.add(addButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(productListArea), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}