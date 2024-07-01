package application;
import javax.swing.SwingUtilities;

import entities.MainFrame;

public class Application {
	public static void main(String [] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainFrame frame = new MainFrame("Title");
				
			}
		});
	}
}
