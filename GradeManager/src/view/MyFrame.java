package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 2052515348188602777L;
	
	public MyFrame(String title) {
		// TODO Auto-generated constructor stub\
		this.setTitle(title);
		
		
		MyMenu menu = new MyMenu(this);
		
		setDefaultSetting();
		
		
		
		
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int)(dim.getWidth()/2), (int)(dim.getHeight()*3/4));
		this.setLocation((dim.width/2)-(this.getWidth()/2), (dim.height/2)-(this.getHeight()/2));

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setDefaultSetting() {
		
	}
	
}
