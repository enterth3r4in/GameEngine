package net.ccgames.crunchy;

import javax.swing.JFrame;

public class GameWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public GameWindow(String title, int width, int height)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.pack();
	}
}
