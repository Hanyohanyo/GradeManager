package view.ribbon;

import javax.swing.JButton;

public class Home extends RibbonPanel {
	private static final long serialVersionUID = 1L;
	
	public Home() {
		super();
		
		JButton home = new JButton("home");
		variablePanel.add(home);
	}
}
