import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JLabel titleLabel;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton loginButton;

    public Login() {
        setTitle("Login Page");
        setSize(580, 630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        titleLabel = new JLabel("Selamat Datang!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        titleLabel.setBounds(50, 20, 480, 30);
        add(titleLabel);

        JLabel subTitleLabel = new JLabel("Silakan Masuk Untuk Melanjutkan");
        subTitleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        subTitleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        subTitleLabel.setBounds(50, 60, 480, 20);
        add(subTitleLabel);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 100, 100, 20);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(50, 130, 480, 30);
        add(usernameField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 180, 100, 20);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 210, 480, 30);
        add(passwordField);

        genderLabel = new JLabel("Jenis Kelamin");
        genderLabel.setBounds(50, 260, 100, 20);
        add(genderLabel);

        maleRadioButton = new JRadioButton("Laki-laki");
        maleRadioButton.setBounds(50, 290, 100, 20);
        add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Perempuan");
        femaleRadioButton.setBounds(200, 290, 100, 20);
        add(femaleRadioButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 340, 480, 40);

        add(loginButton);
        loginButton.addActionListener(actionEvent -> {
            String jk = "";
            if(femaleRadioButton.isSelected()){
                jk = "perempuan";
            }else{
                jk = "laki-laki";
            }
            String finalJk = jk;
            SwingUtilities.invokeLater(() -> new Home(usernameField.getText() , finalJk));
            this.dispose();
        });

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
