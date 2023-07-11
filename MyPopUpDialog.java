import javax.swing.*;
import java.awt.event.*;
class MyPopUpDialog extends JFrame implements ActionListener {
		JButton b;

    public MyPopUpDialog() {
        setSize(400,200);
        b=new JButton("Click me to show dialog!");
        add(b);
        setVisible(true);
        b.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.");
        }

        public static void main(String[] args){
                    new MyPopUpDialog();
        }
}
