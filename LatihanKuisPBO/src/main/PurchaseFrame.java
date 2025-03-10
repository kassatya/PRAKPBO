package main;
import javax.swing.*;
import java.awt.*;

public class PurchaseFrame extends JFrame {
    public PurchaseFrame(String kategori, int harga) {
        setTitle("Pembelian " + kategori);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Kategori: " + kategori));

        panel.add(new JLabel("Jumlah:", SwingConstants.RIGHT));
        JTextField jumlahField = new JTextField();
        panel.add(jumlahField);

        JLabel totalLabel = new JLabel("Total: 0", SwingConstants.RIGHT);
        panel.add(totalLabel);

        JButton beliButton = new JButton("Beli");
        JButton kembaliButton = new JButton("Kembali");
        panel.add(beliButton);
        panel.add(kembaliButton);

        add(panel);

        beliButton.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(jumlahField.getText());
                double total = jumlah * harga * 1.11;
                totalLabel.setText("Total: Rp" + String.format("%,.2f", total));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        kembaliButton.addActionListener(e -> dispose());

        setVisible(true);
    }
}
