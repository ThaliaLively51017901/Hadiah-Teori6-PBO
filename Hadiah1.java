package hadiah1;
import javax.swing.*;
import java.awt.event.*;
public abstract class Hadiah1 implements ActionListener {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("I am a JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 30, 600, 300);
        frame.getContentPane().setLayout(null);
        
        JButton butt1 = new JButton("Munculkan Nama");
        JButton butt2 = new JButton("Munculkan NIM");
        JButton butt3 = new JButton("Munculkan Alamat");
        frame.getContentPane().add(butt1);
        frame.getContentPane().add(butt2);
        frame.getContentPane().add(butt3);
        
        butt1.setBounds(50,20,200,20);
        Hadiah1 app = new Hadiah1(){};
        app.label1 = new JLabel();
        app.label1.setBounds(300, 20, 200, 20);
        frame.getContentPane().add(app.label1);
        butt1.addActionListener(app);
        frame.setVisible(true);
        
        butt2.setBounds(50,60,200,20);
        app.label2 = new JLabel();
        app.label2.setBounds(300, 60, 200, 20);
        frame.getContentPane().add(app.label2);
        butt2.addActionListener(app);
        frame.setVisible(true);
        
        butt3.setBounds(50, 100,200,20);
        app.label3 = new JLabel();
        app.label3.setBounds(300, 100, 200, 20);
        frame.getContentPane().add(app.label3);
        butt3.addActionListener(app);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e )
    {
        label1.setText("Nama Saya Thalia");
        label2.setText("51017901");
        label3.setText("Dg Tata Lama");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    JLabel label1, label2, label3;
}
