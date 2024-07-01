package entities;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private ToolbarPanel toolbar;
	
	public MainFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		toolbar = new ToolbarPanel();
		
		toolbar.setStringListener(e -> textPanel.appendText(e));
		
		toolbar.setSaveListener(() -> {
			System.out.println(textPanel.getContent());
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
	}
}
