package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuPlayNowView;
import view.TicTacToeView;

public class MenuPlayNowController implements ActionListener {
	private MenuPlayNowView mnv ;
	

	public MenuPlayNowController(MenuPlayNowView mnv) {
		this.mnv = mnv;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equals("Một người chơi"))
			this.mnv.setVisible(false);
		if(src.equals("Hai người chơi")) {
//			this.mnv.setVisible(false);
			new TicTacToeView();
		}
	}

}