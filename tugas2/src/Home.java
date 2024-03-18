import java.awt.Font;
import javax.swing.*;

public class Home extends JFrame {
    JLabel welcomeLabel = new JLabel("");
    
    JLabel instructionLabel = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel lengthLabel = new JLabel("Panjang");
    JTextField lengthField = new JTextField();
    JLabel widthLabel = new JLabel("Lebar");
    JTextField widthField = new JTextField();
    JLabel heightLabel = new JLabel("Tinggi");
    JTextField heightField = new JTextField();
    JButton calculateButton = new JButton("Hitung");
    JButton resetButton = new JButton("Reset");
    JLabel resultLabel = new JLabel("Hasil");
    JLabel luasPersegiLabel = new JLabel("Luas Persegi:");
    JLabel luasPersegiField = new JLabel("[Hasil berupa angka]");
    JLabel kelilingPersegiLabel = new JLabel("Keliling Persegi:");
    JLabel kelilingPersegiField = new JLabel("[Hasil berupa angka]");
    JLabel volumeBalokLabel = new JLabel("Volume Balok:");
    JLabel volumeBalokField = new JLabel("[Hasil berupa angka]");
    JLabel luasPermukaanBalokLabel = new JLabel("Luas Permukaan Balok:");
    JLabel luasPermukaanBalokField = new JLabel("[Hasil berupa angka]");;



    public Home(String username , String jenisKelamin) {
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(580, 630);
        setLayout(null);




        welcomeLabel.setBounds(30, 10, 450, 30);
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(Font.BOLD, 26.0f));
        instructionLabel.setBounds(30, 40, 500, 32);
        instructionLabel.setFont(instructionLabel.getFont().deriveFont(Font.BOLD, 16.0f));
        lengthLabel.setBounds(30, 80, 100, 25);
        lengthField.setBounds(150, 80, 380, 25);
        widthLabel.setBounds(30, 130, 100, 25);
        widthField.setBounds(150, 130, 380, 25);
        heightLabel.setBounds(30, 180, 100, 25);
        heightField.setBounds(150, 180, 380, 25);
        calculateButton.setBounds(30, 250, 500, 25);
        resetButton.setBounds(30, 300, 500, 25);
        resultLabel.setBounds(260, 350, 100, 32);
        luasPersegiLabel.setBounds(30, 400, 150, 32);
        luasPersegiField.setBounds(250, 400, 200, 32);
        kelilingPersegiLabel.setBounds(30, 430, 150, 32);
        kelilingPersegiField.setBounds(250, 430, 200, 32);
        volumeBalokLabel.setBounds(30, 460, 150, 32);
        volumeBalokField.setBounds(250, 460, 200, 32);
        luasPermukaanBalokLabel.setBounds(30, 490, 200, 32);
        luasPermukaanBalokField.setBounds(250, 490, 200, 32);



        add(welcomeLabel);
        add(instructionLabel);
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(heightLabel);
        add(heightField);
        add(calculateButton);
        add(resetButton);
        add(resultLabel);
        add(luasPersegiLabel);
        add(luasPersegiField);
        add(kelilingPersegiLabel);
        add(kelilingPersegiField);
        add(volumeBalokLabel);
        add(volumeBalokField);
        add(luasPermukaanBalokLabel);
        add(luasPermukaanBalokField);

        luasPersegiField.setText("");
        kelilingPersegiField.setText("");
        volumeBalokField.setText("");
        luasPermukaanBalokField.setText("");
        if(jenisKelamin.equals("perempuan")){
            welcomeLabel.setText("Welcome, Mrs. "+username);
        }else{
            welcomeLabel.setText("Welcome, Mr. "+username);
        }
        calculateButton.addActionListener(actionEvent -> {

            try {
                double panjang = Double.parseDouble(lengthField.getText());
                double lebar = Double.parseDouble(widthField.getText());
                double tinggi = Double.parseDouble(heightField.getText());

                double luasPersegi = panjang * lebar;
                double kelilingPersegi = 4 * panjang;
                double volumeBalok = panjang * lebar * tinggi;
                double luasPermukaanBalok = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
                luasPersegiField.setText(String.valueOf(luasPersegi));
                kelilingPersegiField.setText(String.valueOf(kelilingPersegi));
                volumeBalokField.setText(String.valueOf(volumeBalok));
                luasPermukaanBalokField.setText(String.valueOf(luasPermukaanBalok));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        resetButton.addActionListener(actionEvent -> {
            lengthField.setText("");
            widthField.setText("");
            heightField.setText("");
            luasPersegiField.setText("");
            kelilingPersegiField.setText("");
            volumeBalokField.setText("");
            luasPermukaanBalokField.setText("");
        });

        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
