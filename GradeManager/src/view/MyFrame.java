package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 2052515348188602777L;
	
	public MyFrame(String title) {
		// TODO Auto-generated constructor stub\
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(300, 400);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dim.width/2)-(this.getWidth()/2), (dim.height/2)-(this.getHeight()/2));
	}
	
	
	
}
