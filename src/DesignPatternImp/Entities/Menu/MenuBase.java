package DesignPatternImp.Entities.Menu;

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

    public List<IMenu> getSubItems(){
    	List<IMenu> subItems = new ArrayList();
    	for (IMenu iMenu : items) {
    		subItems.add(iMenu);
		}
		return subItems;
    }
}
