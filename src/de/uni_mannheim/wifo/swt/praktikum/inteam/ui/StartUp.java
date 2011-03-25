package de.uni_mannheim.wifo.swt.praktikum.inteam.ui;

import de.uni_mannheim.wifo.swt.praktikum.inteam.application.DMSystem;

public class StartUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DMSystem dms = new DMSystem();
		CreateWatchlistFrame cwlf = new CreateWatchlistFrame(dms); 
		cwlf.setVisible(true);
	}

}
