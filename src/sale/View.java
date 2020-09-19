package sale;

import persistence.Store;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    public View() {
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Ventas");
    }

    public void dashboard() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Dashboard", SwingConstants.CENTER);
        title.setBounds(490, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("NIT");
        Object[] fila = new Object[4];
        fila[0] = "dato columna 1";
        fila[1] = "dato columna 3";
        fila[2] = "dato columna 3";
        fila[3] = "dato columna 3";
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        JTable customers = new JTable(modelo);
        customers.setBackground(Color.gray);
        JScrollPane pane = new JScrollPane(customers);

        pane.setBounds(100, 80, 500, 250);
        panel.add(pane);

        JButton newSale = new JButton("Nueva Venta");
        newSale.setBounds(50, 600, 200, 30);
        panel.add(newSale);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sale.View sales = new sale.View();
                sales.addSale();
                dispose();
            }
        };
        newSale.addActionListener(actionListener);
        
        JButton searhCustomer = new JButton("Buscar Venta");
        searhCustomer.setBounds(300, 600, 200, 30);
        panel.add(searhCustomer);

        ActionListener actionListenerSearch = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               sale.View sales = new sale.View();
               sales.findSale();
               dispose();
            }
        };
        searhCustomer.addActionListener(actionListenerSearch);

        this.setVisible(true);
    }

    public void addSale() {
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Nueva venta", SwingConstants.CENTER);
        title.setBounds(185, 30, 350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.PLAIN, 25));
        panel.add(title);

        JLabel lNit = new JLabel("NIT", SwingConstants.LEFT);
        lNit.setBounds(165, 120, 600, 20);
        lNit.setForeground(Color.white);
        lNit.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lNit);

        JTextField tNit = new JTextField();
        tNit.setBounds(165, 150, 400, 25);
        tNit.setBorder(null);
        tNit.setForeground(Color.white);
        tNit.setBackground(Color.decode("#4E586E"));
        panel.add(tNit);

        JLabel lAddProduct = new JLabel("Agregar productos", SwingConstants.LEFT);
        lAddProduct.setBounds(165, 200, 600, 20);
        lAddProduct.setForeground(Color.white);
        lAddProduct.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lAddProduct);

        JLabel lProduct = new JLabel("Producto", SwingConstants.LEFT);
        lProduct.setBounds(165, 240, 600, 20);
        lProduct.setForeground(Color.white);
        lProduct.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lProduct);

        JComboBox cProduct = new JComboBox();
        for (int i = 0; i < Store.productId; i++) {
            cProduct.addItem(Store.products[i].getName());
        }

        cProduct.setBounds(165, 280, 400, 25);
        cProduct.setBackground(Color.decode("#4E586E"));
        cProduct.setForeground(Color.white);
        panel.add(cProduct);

        JLabel lQuantity = new JLabel("Cantidad: ", SwingConstants.LEFT);
        lQuantity.setBounds(165, 340, 120, 20);
        lQuantity.setForeground(Color.white);
        lQuantity.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lQuantity);

        JTextField tQuantity = new JTextField();
        tQuantity.setBounds(275, 340, 100, 25);
        tQuantity.setBorder(null);
        tQuantity.setForeground(Color.white);
        tQuantity.setBackground(Color.decode("#4E586E"));
        panel.add(tQuantity);

        JButton add = new JButton("Agregar");
        add.setBounds(465, 340, 100, 25);
        panel.add(add);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object[] fila = new Object[3];
                fila[0] = Store.products[cProduct.getSelectedIndex()].getName();
                fila[1] = Store.products[cProduct.getSelectedIndex()].getPrice();
                fila[2] = tQuantity.getText();
                modelo.addRow(fila);
            }
        };

        add.addActionListener(actionListener);
        JTable customers = new JTable(modelo);
        customers.setBackground(Color.gray);
        JScrollPane pane = new JScrollPane(customers);

        pane.setBounds(165, 390, 400, 175);
        panel.add(pane);

        JButton create = new JButton("Registrar");
        create.setBounds(165, 600, 400, 30);
        panel.add(create);

        //Action
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int rows = modelo.getRowCount();
                product.Model[] shopCart = new product.Model[rows];
                for (int i = 0; i < rows; i++) {
                    shopCart[i] = new product.Model(i, modelo.getValueAt(i, 0).toString(), modelo.getValueAt(i, 1).toString(), modelo.getValueAt(i, 2).toString(), "");
                    System.out.println(shopCart[i].getProduct());
                }
                Controller.addSale(Store.saleId, tNit.getText(), shopCart, 100);
            }
        };
        create.addActionListener(actionListener2);
        this.setVisible(true);
    }

    public void findSale() {
        setSize(500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Buscar una venta", SwingConstants.CENTER);
        title.setBounds(100, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);

        JLabel lName = new JLabel("Id de la venta", SwingConstants.LEFT);
        lName.setBounds(100, 90, 300, 20);
        lName.setForeground(Color.white);
        lName.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lName);

        JTextField tName = new JTextField();
        tName.setBounds(100, 120, 300, 25);
        tName.setBorder(null);
        tName.setForeground(Color.white);
        tName.setBackground(Color.decode("#4E586E"));
        panel.add(tName);

        JButton search = new JButton("Buscar");
        search.setBounds(100, 180, 300, 30);
        panel.add(search);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        };
        search.addActionListener(actionListener);

        this.setVisible(true);
    }

}
