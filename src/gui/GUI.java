package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class GUI extends JFrame {

	private JPanel contentPane;

	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		Graf graf = new Graf();
		JPanel panel = new JPanel();
		contentPane.add(graf);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblSensores = new JLabel("Sensores");
		panel.add(lblSensores);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
