package com.shopsphere.admin.view;
import javax.swing.*;
import java.awt.*;

public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("ShopSphere Admin Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JPanel productPanel = new JPanel(new BorderLayout());
        productPanel.add(new JLabel("Product Management Module", SwingConstants.CENTER), BorderLayout.NORTH);
        String[] columns = {"ID", "Name", "Price", "Stock"};
        String[][] data = {{"1", "Smartphone X", "49999.00", "50"}, {"2", "Laptop Pro", "85000.00", "30"}};
        JTable table = new JTable(data, columns);
        productPanel.add(new JScrollPane(table), BorderLayout.CENTER);
        
        tabbedPane.addTab("Products", productPanel);
        tabbedPane.addTab("Orders", new JPanel());
        tabbedPane.addTab("Customers", new JPanel());
        
        add(tabbedPane);
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
        
        SwingUtilities.invokeLater(() -> {
            new AdminDashboard().setVisible(true);
        });
    }
}
