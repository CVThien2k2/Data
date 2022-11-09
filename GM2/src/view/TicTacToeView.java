package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Button_cell;

public class TicTacToeView extends JFrame {
	private static final int M = 20;
	private Button_cell[][] BTXO = new Button_cell[M][M];
	private String currentplayer = "O";

	public TicTacToeView() {
		// TODO Auto-generated constructor stub
		init();
		this.setVisible(true);

	}

	public void init() {
		JPanel panel = new JPanel();

		this.setSize(600, 600);
		this.setTitle("Game Caro");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(M, M));
		for (int i = 0; i < M; i++)
			for (int j = 0; j < M; j++) {
				int x = i, y = j;
				Button_cell bt = new Button_cell();
				BTXO[i][j] = bt;
				BTXO[i][j].addMouseListener(new MouseListener() {

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						bt.setBackground(Color.white);
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						bt.setBackground(null);
					}

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						if (bt.p.isVisited() == false) {
							if (currentplayer.equals("O")) {
								bt.setIcon(new ImageIcon("C:\\DATA\\GM2\\src\\view\\o1.png"));
								bt.p.setValue("O");
								bt.p.setVisited(true);
								checkWin5(x, y);
								currentplayer = ("X");

							} else if (currentplayer.equals("X")) {
								bt.setIcon(new ImageIcon("C:\\DATA\\GM2\\src\\view\\x1.png"));
								bt.p.setValue("X");
								bt.p.setVisited(true);

								checkWin5(x, y);
								currentplayer = ("O");

							}

						}
					}
				});
				panel.add(BTXO[i][j]);
			}
		this.add(panel, BorderLayout.CENTER);
	}

	public void checkWin5(int i, int j) {
		// Hang ngang
		int count = 0;
		for (int col = 0; col < M; col++) {
			Button_cell cell = BTXO[i][col];
			if (cell.p.getValue().equals(currentplayer)) {
				count++;
				if (count == 5) {
					System.out.println("Nguoi choi "+currentplayer+" da thang");
					System.exit(0);
				}
			} else {
				count = 0;
			}
		}

		// Chiều dọc
		count = 0;
		for (int row = 0; row < M; row++) {
			Button_cell cell = BTXO[row][j];
			if (cell.p.getValue().equals(currentplayer)) {
				count++;
				if (count == 5) {
					System.out.println("Nguoi choi "+currentplayer+" da thang");
					System.exit(0);
				}
			} else {
				count = 0;
			}
		}

        //        Chéo trái
		int min = Math.min(i, j);
		int TopI = i - min;
		int TopJ = j - min;
		count = 0;

		for (; TopI < M && TopJ < M; TopI++, TopJ++) {
			Button_cell cell = BTXO[TopI][TopJ];
			if (cell.p.getValue().equals(currentplayer)) {
				count++;
				if (count == 5) {
					System.out.println("Nguoi choi "+currentplayer+" da thang");
					System.exit(0);
				}
			} else {
				count = 0;
			}
		}

		// Chéo phải
		min = Math.min(i, j);
		TopI = i - min;
		TopJ = j + min;
		count = 0;

		if (TopJ >= M) {
			int du = TopJ - (M - 1);
			TopI = TopI + du;
			TopJ = M - 1;
		}

		for (; TopI < M && TopJ >= 0; TopI++, TopJ--) {
			Button_cell cell = BTXO[TopI][TopJ];
			if (cell.p.getValue().equals(currentplayer)) {
				count++;
				if (count == 5) {
					System.out.println("Nguoi choi "+currentplayer+" da thang");
					System.exit(0);
				}
			} else {
				count = 0;
			}
		}
	}

}