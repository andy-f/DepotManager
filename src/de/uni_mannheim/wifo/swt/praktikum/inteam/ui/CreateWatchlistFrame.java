package de.uni_mannheim.wifo.swt.praktikum.inteam.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.uni_mannheim.wifo.swt.praktikum.inteam.application.DMSystem;

public class CreateWatchlistFrame extends JFrame {
	private DMSystem dms;
	
	public CreateWatchlistFrame(final DMSystem dms) {
		this.dms = dms;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JLabel("Welcome to SWT"), BorderLayout.NORTH);
		
		JPanel jp = new JPanel();
		final JTextField tf = new JTextField(20);
		jp.add(new JLabel("Name Watchlist: "));
		jp.add(tf);
		this.getContentPane().add(jp, BorderLayout.CENTER);
		JButton jb = new JButton("Create Watchlist");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dms.createWatchlist(tf.getText());
			}
		});
		this.getContentPane().add(jb, BorderLayout.SOUTH);
		this.pack();
	}

}
