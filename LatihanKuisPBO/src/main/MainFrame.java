package main;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String nim) {
        setTitle("Halaman Utama");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(new JLabel("Selamat Datang, " + nim, SwingConstants.CENTER));

        JButton anakBtn = new JButton("DVD Anak");
        JButton dewasaBtn = new JButton("DVD Dewasa");
        JButton lansiaBtn = new JButton("DVD Lansia");

        panel.add(anakBtn);
        panel.add(dewasaBtn);
        panel.add(lansiaBtn);

        add(panel);

        anakBtn.addActionListener(e -> new PurchaseFrame("DVD Anak", 27891));
        dewasaBtn.addActionListener(e -> new PurchaseFrame("DVD Dewasa", 35396));
        lansiaBtn.addActionListener(e -> new PurchaseFrame("DVD Lansia", 38550));

        setVisible(true);
    }
}
