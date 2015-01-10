import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Spiner extends JFrame {

	JButton button1;
	JSpinner spinner1, spinner2, spinner3, spinner4;
	String outputinfo = "";

	public Spiner() {
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);

		button1 = new JButton("Get answer");
		button1.setSize(100,50);
		button1.setLocation(40, 40);
		button1.setBackground(new Color(0,133,255));
		button1.setForeground(Color.white);
		
		this.getContentPane().add(button1);
		this.getContentPane().setBackground(Color.orange);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		spinner1 = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		spinner1.setLocation(200,200);
        this.getContentPane().add(spinner1);
		
	}

	public static void main(String[] args) {

		new Spiner();
	}

}
