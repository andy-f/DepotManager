package de.uni_mannheim.wifo.swt.praktikum.inteam.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import de.uni_mannheim.wifo.swt.praktikum.inteam.application.DMObserver;
import de.uni_mannheim.wifo.swt.praktikum.inteam.application.DMSystem;

public class SomeOtherFrame extends JFrame implements DMObserver {
	public SomeOtherFrame (DMSystem dms) {
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Another Frame");
		
		this.getContentPane().add(new JLabel("Doing Something"));
		
		this.pack();
		
		dms.addObserver(this);
	}

	@Override
	public void update(String message) {
		System.out.println("Watchlist Event:" + message);
		
		this.getContentPane().add(new JLabel("Watchlist Event!"));
		this.pack();
	}
}
