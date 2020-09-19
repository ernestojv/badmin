package product;
import javax.swing.*;
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
        setTitle("Productos");
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

        JButton newCustomer = new JButton("Nuevo Producto");
        newCustomer.setBounds(50, 600, 200, 30);
        panel.add(newCustomer);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                product.View addProduct = new product.View();
                addProduct.addProduct();
                dispose();
            }
        };
        newCustomer.addActionListener(actionListener);


        JButton searhCustomer = new JButton("Buscar Producto");
        searhCustomer.setBounds(300, 600, 200, 30);
        panel.add(searhCustomer);

        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                View searchProduct = new View();
                searchProduct.searchProduct();
                dispose();
            }
        };
        searhCustomer.addActionListener(actionListener2);

        this.setVisible(true);
    }

    public void addProduct() {
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Registrar un nuevo producto", SwingConstants.CENTER);
        title.setBounds(165, 30, 400, 30);
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

        JLabel lPrice = new JLabel("Precio", SwingConstants.LEFT);
        lPrice.setBounds(165, 200, 600, 20);
        lPrice.setForeground(Color.white);
        lPrice.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lPrice);

        JTextField tPrice = new JTextField();
        tPrice.setBounds(165, 230, 400, 25);
        tPrice.setBorder(null);
        tPrice.setForeground(Color.white);
        tPrice.setBackground(Color.decode("#4E586E"));
        panel.add(tPrice);

        JLabel lQuantity = new JLabel("Cantidad", SwingConstants.LEFT);
        lQuantity.setBounds(165, 280, 600, 20);
        lQuantity.setForeground(Color.white);
        lQuantity.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lQuantity);

        JTextField tQuantity = new JTextField();
        tQuantity.setBounds(165, 310, 400, 25);
        tQuantity.setBorder(null);
        tQuantity.setForeground(Color.white);
        tQuantity.setBackground(Color.decode("#4E586E"));
        panel.add(tQuantity);

        JLabel lImage = new JLabel("Imagen", SwingConstants.LEFT);
        lImage.setBounds(165, 280, 600, 20);
        lImage.setForeground(Color.white);
        lImage.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lImage);

        JButton add = new JButton("Registrar");
        add.setBounds(165, 460, 400, 30);
        panel.add(add);
        this.setVisible(true);
        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Controller.createProduct(tName.getText(), tPrice.getName(), tQuantity.getText(), "");
            }
        };
        add.addActionListener(actionListener);
    }

    public void searchProduct(){
        setSize(500, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Buscar un producto", SwingConstants.CENTER);
        title.setBounds(100, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);

        JLabel lName = new JLabel("Nombre", SwingConstants.LEFT);
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
                    View showProduct = new View();
                    System.out.println(Controller.search(tName.getText()).getProduct());
                    showProduct.showProduct(Controller.search(tName.getText()));
                    dispose();
                } else {
                    System.out.println("No encontrado");
                }
            }
        };
        search.addActionListener(actionListener);

        this.setVisible(true);
    }
    public void showProduct(product.Model product){
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Datos del Producto", SwingConstants.CENTER);
        title.setBounds(185, 30, 350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 25));
        panel.add(title);

        JLabel lName = new JLabel("Nombre:", SwingConstants.LEFT);
        lName.setBounds(30, 100, 180, 30);
        lName.setForeground(Color.white);
        lName.setFont(new Font("", Font.BOLD, 25));
        panel.add(lName);

        JLabel name = new JLabel(product.getName(), SwingConstants.LEFT);
        name.setBounds(180, 100, 480, 30);
        name.setForeground(Color.white);
        name.setFont(new Font("", Font.PLAIN, 25));
        panel.add(name);

        JLabel lAge = new JLabel("Precio:", SwingConstants.LEFT);
        lAge.setBounds(30, 140, 180, 30);
        lAge.setForeground(Color.white);
        lAge.setFont(new Font("", Font.BOLD, 25));
        panel.add(lAge);

        JLabel age = new JLabel(product.getPrice(), SwingConstants.LEFT);
        age.setBounds(180, 140, 480, 30);
        age.setForeground(Color.white);
        age.setFont(new Font("", Font.PLAIN, 25));
        panel.add(age);

        JLabel lGender = new JLabel("Cantidad:", SwingConstants.LEFT);
        lGender.setBounds(30, 180, 180, 30);
        lGender.setForeground(Color.white);
        lGender.setFont(new Font("", Font.BOLD, 25));
        panel.add(lGender);

        JLabel gender = new JLabel(product.getQuantity(), SwingConstants.LEFT);
        gender.setBounds(180, 180, 480, 30);
        gender.setForeground(Color.white);
        gender.setFont(new Font("", Font.PLAIN, 25));
        panel.add(gender);

        JLabel lAvatar = new JLabel("Imagen:", SwingConstants.LEFT);
        lAvatar.setBounds(30, 220, 180, 30);
        lAvatar.setForeground(Color.white);
        lAvatar.setFont(new Font("", Font.BOLD, 25));
        panel.add(lAvatar);

        ImageIcon avatar = new ImageIcon("./assets/avatar.jpeg");
        JLabel image = new JLabel(new ImageIcon(avatar.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        image.setBounds(180, 230, 150, 150);
        panel.add(image);

        JButton update = new JButton("Actualizar");
        update.setBounds(180, 500, 150, 30);
        panel.add(update);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                View update = new View();
                Model updatedProduct = new product.Model(product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.getImage());
                update.updateProduct(updatedProduct);
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

            }
        };
        update.addActionListener(actionListener2);
        this.setVisible(true);
    }
    public void updateProduct(Model product){
        this.setSize(720, 720);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Actualizar datos del producto", SwingConstants.CENTER);
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
        tName.setText(product.getName());
        tName.setBounds(165, 150, 400, 25);
        tName.setBorder(null);
        tName.setForeground(Color.white);
        tName.setBackground(Color.decode("#4E586E"));
        panel.add(tName);

        JLabel lPrice = new JLabel("Precio", SwingConstants.LEFT);
        lPrice.setBounds(165, 200, 600, 20);
        lPrice.setForeground(Color.white);
        lPrice.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lPrice);

        JTextField tPrice = new JTextField();
        tPrice.setText(product.getPrice());
        tPrice.setBounds(165, 230, 400, 25);
        tPrice.setBorder(null);
        tPrice.setForeground(Color.white);
        tPrice.setBackground(Color.decode("#4E586E"));
        panel.add(tPrice);


        JLabel lQuantity = new JLabel("Cantidad", SwingConstants.LEFT);
        lQuantity.setBounds(165, 280, 600, 20);
        lQuantity.setForeground(Color.white);
        lQuantity.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lQuantity);

        JTextField tQuantity = new JTextField();
        tQuantity.setText(product.getQuantity());
        tQuantity.setBounds(165, 310, 400, 25);
        tQuantity.setBorder(null);
        tQuantity.setForeground(Color.white);
        tQuantity.setBackground(Color.decode("#4E586E"));
        panel.add(tQuantity);

        JButton add = new JButton("Actualizar");
        add.setBounds(165, 460, 400, 30);
        panel.add(add);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                product.Model updatedProduct = Controller.updateProduct(product.getId(), tName.getText(), tPrice.getText(), tQuantity.getText(), product.getImage());
                if(updatedProduct != null){
                    System.out.println("Listo");
                    System.out.println(updatedProduct.getProduct());
                }
            }
        };
        add.addActionListener(actionListener);
        this.setVisible(true);
    }
}
