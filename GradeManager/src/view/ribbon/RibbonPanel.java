package view.ribbon;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class RibbonPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private ArrayList<ImageIcon> iconlist;
//	private ArrayList<JButton> btnList;
	private ImageIcon tip;
	private JButton btnTip;
	private ImageIcon setting;
	private JButton btnSetting;
	private JPanel fixedPanel;
	protected JPanel variablePanel;
	
	
	public RibbonPanel() {
		// TODO Auto-generated constructor stub
		fixedPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		variablePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		iconlist = new ArrayList<>();
//		btnList = new ArrayList<>();
		
		btnTip = new JButton("tip");
//		btnTip = new JButton(new ImageIcon(""));
		btnSetting = new JButton("setting");
//		btnSetting = new JButton(new ImageIcon("img/settings-work-tool.jpg"));
		tip = new ImageIcon();
//		setting = new ImageIcon("img/settings-work-tool.png");
		this.setLayout(new GridLayout(1, 2));
		
		fixedPanel.add(btnTip);
		fixedPanel.add(btnSetting);
		fixedPanel.setBorder(new LineBorder(Color.black));
		variablePanel.setBorder(new LineBorder(Color.black));
		this.add(variablePanel);
		this.add(fixedPanel);
		iconlist.add(tip);
		iconlist.add(setting);
	}
	
	public void addToList(ImageIcon icon) {
		iconlist.add(icon);
	}
}
