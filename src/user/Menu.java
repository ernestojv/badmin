package user;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

public class Menu extends JFrame{
    public Menu() {
        setSize(1280, 720);
        init();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Menú");
    }

    private void init() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Bienvenido", SwingConstants.CENTER);
        title.setBounds(490, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);
        //Buttons
        ImageIcon customerI = new ImageIcon("./assets/customers.png");
        JButton customer = new JButton(new ImageIcon(customerI.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        customer.setBounds(140, 260, 120, 120);
        panel.add(customer);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                customer.View customer = new customer.View();
                try {
                    customer.dashboard();
                    dispose();
                } catch (PrinterException e) {
                    e.printStackTrace();
                }
            }
        };
        customer.addActionListener(actionListener);

        JLabel lCustomer = new JLabel("Clientes", SwingConstants.CENTER);
        lCustomer.setBounds(140, 390, 120, 20);
        lCustomer.setForeground(Color.white);
        lCustomer.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lCustomer);

        ImageIcon productI = new ImageIcon("./assets/products.png");
        JButton product = new JButton(new ImageIcon(productI.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        product.setBounds(440, 260, 120, 120);
        panel.add(product);

        ActionListener actionListenerProduct = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              product.View product = new product.View();
                try {
                    product.dashboard();
                } catch (PrinterException e) {
                    e.printStackTrace();
                }
                dispose();
            }
        };
        product.addActionListener(actionListenerProduct);

        JLabel lProduct = new JLabel("Productos", SwingConstants.CENTER);
        lProduct.setBounds(440, 390, 120, 20);
        lProduct.setForeground(Color.white);
        lProduct.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lProduct);

        ImageIcon salesI = new ImageIcon("./assets/sales.png");
        JButton sales = new JButton(new ImageIcon(salesI.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        sales.setBounds(740, 260, 120, 120);
        panel.add(sales);

        ActionListener actionListenerSales = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sale.View sale = new sale.View();
                sale.dashboard();
                dispose();
            }
        };
        sales.addActionListener(actionListenerSales);

        JLabel lSales = new JLabel("Ventas", SwingConstants.CENTER);
        lSales.setBounds(740, 390, 120, 20);
        lSales.setForeground(Color.white);
        lSales.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lSales);

        ImageIcon reportI = new ImageIcon("./assets/reports.png");
        JButton report = new JButton(new ImageIcon(reportI.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        report.setBounds(1040, 260, 120, 120);
        panel.add(report);

        JLabel lReport = new JLabel("Reportes", SwingConstants.CENTER);
        lReport.setBounds(1040, 390, 120, 20);
        lReport.setForeground(Color.white);
        lReport.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lReport);

    }
}
