package DesignPatternImp.Entities.Menu;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MenuText extends MenuBase {

	public MenuText(){
		JLabel txt = new JLabel("Text Menu");
		this.add(txt);
		JLabel txt1 = new JLabel("prkpoekrpogk");
		this.add(txt1);
	}
}
