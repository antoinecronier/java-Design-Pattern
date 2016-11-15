package DesignPatternImp.Entities.Menu;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JComponent;

import DesignPatternImp.AbstractFactory.IMenu;

public abstract class MenuBase extends JComponent implements IMenu {
	private ArrayList<MenuBase> items = new ArrayList<MenuBase>();

	public void addItem(IMenu menuBaseItem){
		if (menuBaseItem instanceof MenuBase) {
			this.items.add((MenuBase) menuBaseItem);
		}
	}

    public void Remove(MenuBase menuBaseItem){
    	this.items.remove(menuBaseItem);
    }

    public void addItem(JComponent item){
		this.add(item);
	}
    
    public void addItem(Component item){
		this.add(item);
	}

    public void Print() {

	}
}
