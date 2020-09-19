package customer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

public class View extends JFrame {
    public View() {
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Clientes");
    }

    public void dashboard() throws PrinterException {
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

        JButton newCustomer = new JButton("Nuevo Cliente");
        newCustomer.setBounds(50, 600, 200, 30);
        panel.add(newCustomer);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                customer.View addCustomer = new customer.View();
                addCustomer.addCustomer();
                dispose();
            }
        };
        newCustomer.addActionListener(actionListener);


        JButton searhCustomer = new JButton("Buscar Cliente");
        searhCustomer.setBounds(300, 600, 200, 30);
        panel.add(searhCustomer);

        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                customer.View searchCustomer = new customer.View();
                searchCustomer.findCustomer();
                dispose();
            }
        };
        searhCustomer.addActionListener(actionListener2);

        this.setVisible(true);
    }

    public void bulkLoad() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Carga masiva", SwingConstants.CENTER);
        title.setBounds(490, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(getParent());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
        }
        chooser.setBounds(100, 120, 400, 400);
    }

    public void addCustomer() {
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Registrar un nuevo cliente", SwingConstants.CENTER);
        title.setBounds(185, 30, 350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.PLAIN, 25));
        panel.add(title);

        JLabel lName = new JLabel("Nombre", SwingConstants.LEFT);
        lName.setBounds(165, 120, 600, 20);
        lName.setForeground(Color.white);
        lName.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lName);

        JTextField tName = new JTextField();
        tName.setBounds(165, 150, 400, 25);
        tName.setBorder(null);
        tName.setForeground(Color.white);
        tName.setBackground(Color.decode("#4E586E"));
        panel.add(tName);

        JLabel lAge = new JLabel("Edad", SwingConstants.LEFT);
        lAge.setBounds(165, 200, 600, 20);
        lAge.setForeground(Color.white);
        lAge.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lAge);

        JTextField tAge = new JTextField();
        tAge.setBounds(165, 230, 400, 25);
        tAge.setBorder(null);
        tAge.setForeground(Color.white);
        tAge.setBackground(Color.decode("#4E586E"));
        panel.add(tAge);

        JLabel lGender = new JLabel("Género", SwingConstants.LEFT);
        lGender.setBounds(165, 280, 600, 20);
        lGender.setForeground(Color.white);
        lGender.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lGender);

        JComboBox cGender = new JComboBox();
        cGender.addItem("M");
        cGender.addItem("F");
        cGender.setBounds(165, 310, 400, 25);
        cGender.setBackground(Color.decode("#4E586E"));
        cGender.setForeground(Color.white);
        panel.add(cGender);

        JLabel lNit = new JLabel("NIT", SwingConstants.LEFT);
        lNit.setBounds(165, 360, 600, 20);
        lNit.setForeground(Color.white);
        lNit.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lNit);

        JTextField tNit = new JTextField();
        tNit.setBounds(165, 390, 400, 25);
        tNit.setBorder(null);
        tNit.setForeground(Color.white);
        tNit.setBackground(Color.decode("#4E586E"));
        panel.add(tNit);

        JButton add = new JButton("Registrar");
        add.setBounds(165, 460, 400, 30);
        panel.add(add);
        this.setVisible(true);
        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Controller.addCustomer(tNit.getText(), tName.getText(), tAge.getText(), cGender.getSelectedItem().toString());
            }
        };
        add.addActionListener(actionListener);
    }

    public void findCustomer() {
        setSize(500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Buscar un Cliente", SwingConstants.CENTER);
        title.setBounds(100, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);

        JLabel lName = new JLabel("NIT", SwingConstants.LEFT);
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
                if (Controller.search(tName.getText()) != null) {
                    Controller.search(tName.getText());
                    customer.View showCustomer = new customer.View();
                    showCustomer.showCustomer(Controller.search(tName.getText()));
                    dispose();
                } else {
                    System.out.println("No encontrado");
                }
            }
        };
        search.addActionListener(actionListener);

        this.setVisible(true);
    }

    public void showCustomer(Model customer) {
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Datos del cliente", SwingConstants.CENTER);
        title.setBounds(185, 30, 350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 25));
        panel.add(title);

        JLabel lName = new JLabel("Nombre:", SwingConstants.LEFT);
        lName.setBounds(30, 100, 180, 30);
        lName.setForeground(Color.white);
        lName.setFont(new Font("", Font.BOLD, 25));
        panel.add(lName);

        JLabel name = new JLabel(customer.getName(), SwingConstants.LEFT);
        name.setBounds(180, 100, 480, 30);
        name.setForeground(Color.white);
        name.setFont(new Font("", Font.PLAIN, 25));
        panel.add(name);

        JLabel lAge = new JLabel("Edad:", SwingConstants.LEFT);
        lAge.setBounds(30, 140, 180, 30);
        lAge.setForeground(Color.white);
        lAge.setFont(new Font("", Font.BOLD, 25));
        panel.add(lAge);

        JLabel age = new JLabel(customer.getAge(), SwingConstants.LEFT);
        age.setBounds(180, 140, 480, 30);
        age.setForeground(Color.white);
        age.setFont(new Font("", Font.PLAIN, 25));
        panel.add(age);

        JLabel lGender = new JLabel("Sexo:", SwingConstants.LEFT);
        lGender.setBounds(30, 180, 180, 30);
        lGender.setForeground(Color.white);
        lGender.setFont(new Font("", Font.BOLD, 25));
        panel.add(lGender);

        JLabel gender = new JLabel(customer.getGender(), SwingConstants.LEFT);
        gender.setBounds(180, 180, 480, 30);
        gender.setForeground(Color.white);
        gender.setFont(new Font("", Font.PLAIN, 25));
        panel.add(gender);

        JLabel lNit = new JLabel("NIT:", SwingConstants.LEFT);
        lNit.setBounds(30, 220, 180, 30);
        lNit.setForeground(Color.white);
        lNit.setFont(new Font("", Font.BOLD, 25));
        panel.add(lNit);

        JLabel nit = new JLabel(customer.getNit(), SwingConstants.LEFT);
        nit.setBounds(180, 220, 480, 30);
        nit.setForeground(Color.white);
        nit.setFont(new Font("", Font.PLAIN, 25));
        panel.add(nit);

        JLabel lAvatar = new JLabel("Avatar:", SwingConstants.LEFT);
        lAvatar.setBounds(30, 260, 180, 30);
        lAvatar.setForeground(Color.white);
        lAvatar.setFont(new Font("", Font.BOLD, 25));
        panel.add(lAvatar);

        ImageIcon avatar = new ImageIcon("./assets/avatar.jpeg");
        JLabel image = new JLabel(new ImageIcon(avatar.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        image.setBounds(180, 270, 150, 150);
        panel.add(image);

        JButton update = new JButton("Actualizar");
        update.setBounds(180, 500, 150, 30);
        panel.add(update);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                customer.View updateCustomer = new customer.View();
                updateCustomer.updateCustomer(customer);
                dispose();
            }
        };
        update.addActionListener(actionListener);

        JButton delete = new JButton("Eliminar");
        delete.setBounds(400, 500, 150, 30);
        panel.add(delete);

        //Action
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                customer.View deleteCustomer = new customer.View();
                deleteCustomer.deleteCustomer(customer);
                dispose();
            }
        };
        update.addActionListener(actionListener2);
        this.setVisible(true);
    }

    public void updateCustomer(Model customer) {
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Actualizar datos del cliente", SwingConstants.CENTER);
        title.setBounds(185, 30, 350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.PLAIN, 25));
        panel.add(title);

        JLabel lName = new JLabel("Nombre", SwingConstants.LEFT);
        lName.setBounds(165, 120, 600, 20);
        lName.setForeground(Color.white);
        lName.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lName);

        JTextField tName = new JTextField();
        tName.setText(customer.getName());
        tName.setBounds(165, 150, 400, 25);
        tName.setBorder(null);
        tName.setForeground(Color.white);
        tName.setBackground(Color.decode("#4E586E"));
        panel.add(tName);

        JLabel lAge = new JLabel("Edad", SwingConstants.LEFT);
        lAge.setBounds(165, 200, 600, 20);
        lAge.setForeground(Color.white);
        lAge.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lAge);

        JTextField tAge = new JTextField();
        tAge.setText(customer.getAge());
        tAge.setBounds(165, 230, 400, 25);
        tAge.setBorder(null);
        tAge.setForeground(Color.white);
        tAge.setBackground(Color.decode("#4E586E"));
        panel.add(tAge);

        JLabel lGender = new JLabel("Género", SwingConstants.LEFT);
        lGender.setBounds(165, 280, 600, 20);
        lGender.setForeground(Color.white);
        lGender.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lGender);

        JComboBox cGender = new JComboBox();
        cGender.addItem("M");
        cGender.addItem("F");
        cGender.setSelectedItem(customer.getGender());
        cGender.setBounds(165, 310, 400, 25);
        cGender.setBackground(Color.decode("#4E586E"));
        cGender.setForeground(Color.white);
        panel.add(cGender);

        JLabel lNit = new JLabel("NIT", SwingConstants.LEFT);
        lNit.setBounds(165, 360, 600, 20);
        lNit.setForeground(Color.white);
        lNit.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lNit);

        JTextField tNit = new JTextField();
        tNit.setText(customer.getNit());
        tNit.setBounds(165, 390, 400, 25);
        tNit.setBorder(null);
        tNit.setForeground(Color.white);
        tNit.setBackground(Color.decode("#4E586E"));
        panel.add(tNit);

        JButton add = new JButton("Actualizar");
        add.setBounds(165, 460, 400, 30);
        panel.add(add);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Model updatedCustomer = Controller.updateCustomer(customer.id ,tNit.getText(), tName.getText(), tAge.getText(), cGender.getSelectedItem().toString());
                System.out.println(updatedCustomer.getCustomer());
                View showCustomer = new View();
                showCustomer.showCustomer(updatedCustomer);
                dispose();
            }
        };
        add.addActionListener(actionListener);
        this.setVisible(true);
    }

    public void deleteCustomer(Model customer) {
        setSize(500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title

        JLabel lName = new JLabel("¿Ésta seguro que desea eliminar al cliente?", SwingConstants.CENTER);
        lName.setBounds(25, 30, 450, 30);
        lName.setForeground(Color.white);
        lName.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lName);

        JLabel name = new JLabel("Nombre del cliente", SwingConstants.CENTER);
        name.setBounds(100, 90, 300, 20);
        name.setForeground(Color.white);
        name.setFont(new Font("", Font.PLAIN, 20));
        panel.add(name);

        JButton accept = new JButton("Aceptar");
        accept.setBounds(60, 180, 150, 30);
        panel.add(accept);

        JButton cancel = new JButton("Cancelar");
        cancel.setBounds(300, 180, 150, 30);
        panel.add(cancel);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Controller.deleteCustomer(customer);
            }
        };
        accept.addActionListener(actionListener);
    }
}
