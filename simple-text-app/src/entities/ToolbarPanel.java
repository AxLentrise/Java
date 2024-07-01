package entities;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.SaveListener;
import controllers.StringListener;

public class ToolbarPanel extends JPanel {
	
	private JButton btn1;
	private JButton btn2;
	private JButton saveBtn;
	
	private StringListener textListener;
	private SaveListener saveListener;
	
	public ToolbarPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));

		btn1 = new JButton("Good Morning");
		btn2 = new JButton("Goodbye");
		saveBtn = new JButton("Save");
		
		btn1.addActionListener(e -> {
			if(textListener != null) {
				textListener.textEmitted("Good Morning\n");
			}
		});
		
		btn2.addActionListener(e -> {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
		});
		
		saveBtn.addActionListener(e -> {
			if(saveListener != null) {
				saveListener.save();
			}
		});
		
		add(btn1);
		add(btn2);
		add(saveBtn);
	}
	
	public void setStringListener(StringListener listener) {
		textListener = listener;
	}
	
	public void setSaveListener(SaveListener listener) {
		saveListener = listener;
	}
}
