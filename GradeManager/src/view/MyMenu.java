package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import view.ribbon.Attendance;
import view.ribbon.File;
import view.ribbon.Home;
import view.ribbon.RibbonPanel;
import view.ribbon.Save;

public class MyMenu implements MouseListener {
	private JMenuBar mb;
	private CardLayout layout;
	private JPanel ribbon;
	private ArrayList<JMenu> menuList;
	private Home homePanel;
	private File filePanel;
	private Save savePanel;
	private Attendance attendPanel;
	
	JMenu home, file, save, attend;
	
	public MyMenu(JFrame frame) {
		/* generate object */
		mb = new JMenuBar();
		layout = new CardLayout();
		ribbon = new JPanel(layout);
		menuList = new ArrayList<JMenu>();
		home = new JMenu("home");
		file = new JMenu("file");
		save = new JMenu("save");
		attend = new JMenu("attend");
		homePanel = new Home();
		filePanel = new File();
		savePanel = new Save();
		attendPanel = new Attendance();
		
		ribbon.setBorder(new LineBorder(Color.black));
		
		frame.setJMenuBar(mb);
		
		home.addMouseListener(this);
		mb.add(home);
		file.addMouseListener(this);
		mb.add(file);
		save.addMouseListener(this);
		mb.add(save);
		attend.addMouseListener(this);
		mb.add(attend);
		
		
		ribbon.add(homePanel, "home");
		ribbon.add(filePanel, "file");
		ribbon.add(savePanel, "save");
		ribbon.add(attendPanel, "attend");

		
		frame.getContentPane().add(ribbon, BorderLayout.NORTH);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JMenu m = (JMenu)e.getSource();
		
		System.out.println("mouse clicked!!: " + m.getText());
		
		switch(m.getText()) {
		case "home" :
			System.out.println(m.getText());
			layout.show(ribbon, m.getText());
			break;
		case "file" :
			System.out.println(m.getText());
			layout.show(ribbon, m.getText());
			break;
		case "save" :
			System.out.println(m.getText());
			layout.show(ribbon, m.getText());
			break;
		case "attend" :
			System.out.println(m.getText());
			layout.show(ribbon, m.getText());
			break;
		}
		
		m.setSelected(false);
		m.setFocusable(false);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JMenu m = (JMenu)e.getSource();
		m.setSelected(false);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}