package proyectoSemana3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class Frm2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm2 frame = new Frm2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frm2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(32, 110, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel((String) null);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(32, 145, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel((String) null);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.GREEN);
		lblNewLabel_2.setBounds(32, 185, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("adios");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(29, 236, 558, 14);
		contentPane.add(btnNewButton);
	}
}
