package DesignPatternImp.Entities.Menu;

import java.util.List;

import javax.swing.JLabel;

import DesignPatternImp.AbstractFactory.IMenu;

public class MenuImage extends MenuBase {

	public MenuImage(){
		JLabel txt = new JLabel("hoho");
		this.add(txt);
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub

	}
}
