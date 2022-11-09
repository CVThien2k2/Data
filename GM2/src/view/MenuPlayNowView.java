package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MenuPlayNowController;

import javax.swing.JLayeredPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPlayNowView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public MenuPlayNowView() {
		MenuPlayNowController ac = new MenuPlayNowController(this);
		this.setVisible(true);

		setTitle("Game Caro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(659, 423);
		setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JButton btnNewButton = new JButton("Một người chơi");
		btnNewButton.addActionListener(ac);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Hãy chọn chế độ chơi");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -326, SpringLayout.SOUTH, contentPane);
		lblNewLabel.setBackground(new Color(255, 255, 0));
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 177, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -179, SpringLayout.EAST, contentPane);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Hai người chơi");
		btnNewButton_1.addActionListener(ac);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 222, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 242, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -48, SpringLayout.NORTH, btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1);
	}
}
