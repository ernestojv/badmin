package user;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    public View(){
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Autorización");
    }
    public void login() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Inicio de Sesión", SwingConstants.CENTER);
        title.setBounds(170, 30, 300, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);
        //Form
        //User
        JLabel lUser = new JLabel("Nombre de usuario", SwingConstants.LEFT);
        lUser.setBounds(100, 160, 600, 20);
        lUser.setForeground(Color.white);
        lUser.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lUser);

        JTextField tUser = new JTextField();
        tUser.setBounds(100, 200, 400, 25);
        tUser.setBorder(null);
        tUser.setForeground(Color.white);
        tUser.setBackground(Color.decode("#4E586E"));
        panel.add(tUser);

        //password
        JLabel lPassword = new JLabel("Contraseña", SwingConstants.LEFT);
        lPassword.setBounds(100, 260, 600, 20);
        lPassword.setForeground(Color.white);
        lPassword.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lPassword);

        JTextField tPassword = new JTextField();
        tPassword.setBounds(100, 300, 400, 25);
        tPassword.setBorder(null);
        tPassword.setForeground(Color.white);
        tPassword.setBackground(Color.decode("#4E586E"));
        panel.add(tPassword);

        JLabel lRegister = new JLabel("¿No está registrado?", SwingConstants.LEFT);
        lRegister.setBounds(100, 360, 600, 20);
        lRegister.setForeground(Color.white);
        lRegister.setFont(new Font("", Font.PLAIN, 14));
        panel.add(lRegister);

        //Image
        ImageIcon maxLogo = new ImageIcon("./assets/maxlogo.png");
        JLabel image = new JLabel(new ImageIcon(maxLogo.getImage().getScaledInstance(640, 640, Image.SCALE_SMOOTH)));
        image.setBounds(640, 0, 640, 683);
        panel.add(image);

        //Button
        JButton signIn = new JButton("Iniciar Sesión");
        signIn.setBounds(160, 460, 300, 30);
        panel.add(signIn);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               Model actualUser = Controller.login(tUser.getText(), tPassword.getText());
               Menu menu = new Menu();
               if(actualUser != null){
                   menu.setVisible(true);
                   dispose();
               }

            }
        };
        signIn.addActionListener(actionListener);
        this.setVisible(true);
    }
    public void register(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        //Title
        JLabel title = new JLabel("Registro de Usuarios", SwingConstants.CENTER);
        title.setBounds(120, 30, 350, 30);
        title.setForeground(Color.white);
        title.setFont(new Font("", Font.BOLD, 30));
        panel.add(title);
        //Form
        //User
        JLabel lUser = new JLabel("Nombre de usuario", SwingConstants.LEFT);
        lUser.setBounds(100, 140, 600, 20);
        lUser.setForeground(Color.white);
        lUser.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lUser);

        JTextField tUser = new JTextField();
        tUser.setBounds(100, 180, 400, 25);
        tUser.setBorder(null);
        tUser.setForeground(Color.white);
        tUser.setBackground(Color.decode("#4E586E"));
        panel.add(tUser);

        JLabel lNUser = new JLabel("Nombre", SwingConstants.LEFT);
        lNUser.setBounds(100, 220, 600, 20);
        lNUser.setForeground(Color.white);
        lNUser.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lNUser);

        JTextField tNUser = new JTextField();
        tNUser.setBounds(100, 260, 400, 25);
        tNUser.setBorder(null);
        tNUser.setForeground(Color.white);
        tNUser.setBackground(Color.decode("#4E586E"));
        panel.add(tNUser);

        //password
        JLabel lPassword = new JLabel("Contraseña", SwingConstants.LEFT);
        lPassword.setBounds(100, 300, 600, 20);
        lPassword.setForeground(Color.white);
        lPassword.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lPassword);

        JTextField tPassword = new JTextField();
        tPassword.setBounds(100, 340, 400, 25);
        tPassword.setBorder(null);
        tPassword.setForeground(Color.white);
        tPassword.setBackground(Color.decode("#4E586E"));
        panel.add(tPassword);

        JLabel lRPassword = new JLabel("Registrar contraseña", SwingConstants.LEFT);
        lRPassword.setBounds(100, 380, 600, 20);
        lRPassword.setForeground(Color.white);
        lRPassword.setFont(new Font("", Font.PLAIN, 20));
        panel.add(lRPassword);

        JTextField tRPassword = new JTextField();
        tRPassword.setBounds(100, 420, 400, 25);
        tRPassword.setBorder(null);
        tRPassword.setForeground(Color.white);
        tRPassword.setBackground(Color.decode("#4E586E"));
        panel.add(tRPassword);

        JLabel lRegister = new JLabel("¿Ya tienes una cuenta?", SwingConstants.LEFT);
        lRegister.setBounds(100, 460, 600, 20);
        lRegister.setForeground(Color.white);
        lRegister.setFont(new Font("", Font.PLAIN, 14));
        panel.add(lRegister);

        //Image
        ImageIcon maxLogo = new ImageIcon("./assets/maxlogo.png");
        JLabel image = new JLabel(new ImageIcon(maxLogo.getImage().getScaledInstance(640, 640, Image.SCALE_SMOOTH)));
        image.setBounds(640, 0, 640, 683);
        panel.add(image);

        //Button
        JButton signUp = new JButton("Registrar");
        signUp.setBounds(160, 520, 300, 30);
        panel.add(signUp);

        //Action
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Action
            }
        };
        signUp.addActionListener(actionListener);

    }
}

