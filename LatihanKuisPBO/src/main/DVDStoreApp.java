package main;
import javax.swing.SwingUtilities;

public class DVDStoreApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}
