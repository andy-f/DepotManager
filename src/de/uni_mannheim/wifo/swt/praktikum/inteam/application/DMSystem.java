package de.uni_mannheim.wifo.swt.praktikum.inteam.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import de.uni_mannheim.wifo.swt.praktikum.inteam.model.Watchlist;
import de.uni_mannheim.wifo.swt.praktikum.inteam.ui.SomeOtherFrame;

public class DMSystem {
	private List<Watchlist> watchlists; 
	private List<DMObserver> observers;
	
	public DMSystem() {
		watchlists = new ArrayList<Watchlist>();
		observers = new ArrayList<DMObserver>();
	}
	
	public void createWatchlist(String name) {
		System.out.println("new watchlist created: " + name);
		Watchlist wl = new Watchlist(name);
		watchlists.add(wl);
		new SomeOtherFrame(this).setVisible(true);
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("TimeEvent!");
				watchlistEvent("SWT-Aktie steigt!");
			}
		}, 1000);
	}
	
	public void watchlistEvent(String message) {
		for(DMObserver o : observers) {
			o.update(message);
		}
	}

	public void addObserver(DMObserver observer) {
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
	}
}
