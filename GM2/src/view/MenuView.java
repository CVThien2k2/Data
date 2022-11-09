package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import controller.MenuController;

import javax.swing.SpringLayout;

public class MenuView extends JFrame {

	private JPanel contentPane;

	public MenuView() {
		init();
		this.setVisible(true);
	}

	public void init() {
		setForeground(Color.RED);
		setSize(651, 480);
		setFont(new Font("Dialog", Font.BOLD, 15));
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		MenuController ac = new MenuController(this);

		JButton btnNewButton = new JButton("Chơi Ngay");
		btnNewButton.addActionListener(ac);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.addActionListener(ac);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 222, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -66, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 246, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -246, SpringLayout.EAST, contentPane);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setToolTipText("Thoát");
		contentPane.add(btnNewButton_1);
	}
}
